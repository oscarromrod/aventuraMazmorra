package AventuraEnLaMazmorra.entidades;

import java.util.ArrayList;

public class Combate {


    private ArrayList<Heroe> heroes;
    private  Sala sala;
    private  int turno;


    public Combate(Sala sala, int turno) {
        this.sala = sala;
        this.turno = turno;

        this.heroes = new ArrayList<>();
    }


    public void iniciarCombate() {

        while (!this.heroes.isEmpty()) {

        }

    }



    public void turnoHeroes() {

    }


    public void turnoEnemigos() {


    }


    public void mostrarEstadoCombate() {

    }


    public boolean combateTerminado() {
        return false ;
    }


    public void distribuirRecompensas() {

    }



}
