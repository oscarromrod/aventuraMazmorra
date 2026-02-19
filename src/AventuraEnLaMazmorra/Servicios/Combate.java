package AventuraEnLaMazmorra.Servicios;

import AventuraEnLaMazmorra.entidades.Enemigo;
import AventuraEnLaMazmorra.entidades.Heroe;
import AventuraEnLaMazmorra.entidades.Sala;

import java.util.ArrayList;

public class Combate {


    private ArrayList<Heroe> heroes;
    private Sala sala;
    private Integer turno;

    public Combate(Sala sala, Integer turno) {
        this.sala = sala;
        this.turno = turno;
        this.heroes = new ArrayList<>();
    }




    public void iniciarCombate() {

        int contador = 0;

        while (true) {
            IO.println("Turno " + contador);

            this.mostrarEstadoCombate();

            this.turnoHeroes();


            if (this.combateTerminado()) {
                break;
            }


            this.turnoEnemigos();


            if (this.combateTerminado()) {
                break;
            }

            contador++;
        }


        if (this.sala.getEnemigosVivos().size() <= 0) {
            System.out.println("¡Felicitaciones a los ganadores, son los heroes!");
            this.distribuirRecompensas();
        } else {
            System.out.println("Los enemigos son los ganadores");
        }

    }


    public void turnoHeroes() {

        for (Heroe hero : this.heroes) {

            if (hero.estaVivo()) {
                for(Enemigo enemigo : this.sala.getEnemigos()) {
                    hero.atacar(enemigo);
                    IO.println("El héroe " + hero.getNombre() + "atacó al enemigo "+ enemigo.getNombre());
                }
            }

        }
    }

    public void turnoEnemigos() {


        for(Enemigo enemigo : this.sala.getEnemigos()) {

            while (true) {
                try {
                    int herosRandom = (int) (Math.random() * this.heroes.size());
                    Heroe heroe = this.heroes.get(herosRandom);

                    if (enemigo.isVivo()) {
                        enemigo.atacar(heroe);
                        IO.println("El enemigo " + enemigo.getNombre() + "atacó al héroe "+ heroe.getNombre());
                    }

                    break;

                } catch (Exception e) {
                    continue;
                }
            }


        }

    }


    /**
     *  muestra vida de héroes y enemigos
     */
    public void mostrarEstadoCombate() {

        IO.println("*****************************************************");
        IO.println("mostrar estado de Combate: ");

        IO.println("Heroes: ");

        for (Heroe hero : this.heroes) {

            IO.println(hero.getNombre() + ": " + hero.getPuntosVidaActual() + " HP");

        }
        IO.println("Enemigos: ");

        for(Enemigo enemigo : this.sala.getEnemigos()) {

            IO.println(enemigo.getNombre() + ": " + enemigo.getPuntosVidaActual() + " HP");

        }
        IO.println("******************************************************");
    }


    public boolean combateTerminado() {

        boolean todoHeroesEstaMuertos = true,todoEnemigosEstaMuertos = true;

        for (Heroe hero : this.heroes) {
            todoHeroesEstaMuertos = !hero.estaVivo();
        }

        for (Enemigo enemigo : this.sala.getEnemigos()) {
            todoEnemigosEstaMuertos = !enemigo.estaVivo();
        }

        return todoHeroesEstaMuertos || todoEnemigosEstaMuertos;
    }


    public void distribuirRecompensas() {
        int sumExperncia = 0, gananExp = 0;
        ArrayList<Heroe> heroesViven = new ArrayList<>();

        try {
            for (Enemigo enemigo : this.sala.getEnemigos()) {
                sumExperncia += enemigo.getExpOtorgada();
            }


            for (Heroe hero : this.heroes) {
                if (hero.estaVivo()) {
                    heroesViven.add(hero);
                }
            }


            gananExp = sumExperncia / heroesViven.size();

            for (Heroe hero : heroesViven) {
                hero.ganarExperiencia(gananExp);
                IO.println(hero.getNombre() +" : gana puntos es "+ hero.getExperiencia() +" exp");
            }

            this.heroes.addAll(heroesViven);

        } catch (Exception e) {
            IO.println("No hay puntos de distribución");
        }

    }
}
