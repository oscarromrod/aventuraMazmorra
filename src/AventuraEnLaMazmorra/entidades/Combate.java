package AventuraEnLaMazmorra.entidades;

import java.util.ArrayList;

public class Combate {
    /*
    Atributos:
    ArrayList<Heroe> heroes
    Sala sala
    int turno
     */
    private ArrayList<Heroe> heroes;
    private  Sala sala;
    private  int turno;

    public Combate(Sala sala, int turno) {
        this.sala = sala;
        this.turno = turno;

        this.heroes = new ArrayList<>();
    }
}
