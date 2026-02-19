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

        while (!this.combateTerminado()) {

        }

    }



    public void turnoHeroes() {

    }


    public void turnoEnemigos() {


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
        IO.println("*****************************************************");
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

    }
}
