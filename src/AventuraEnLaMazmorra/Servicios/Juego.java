package AventuraEnLaMazmorra.Servicios;

import AventuraEnLaMazmorra.entidades.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    //https://code-with-me.global.jetbrains.com/fuasFiVl-bO4tdgW8izzpA

    //-------Atributos-----------

    private ArrayList<Heroe> equipo;
    private ArrayList<Sala> salas;
    private Integer SalaActual = 1;
    private Boolean juegoTerminado;








    //------------METODOS--------------

     public void inicializarJuego(){

        Sala sala1 = new Sala(1);
        Sala sala2 = new Sala(2);
        Sala sala3 = new Sala(3);
        Sala sala4 = new Sala(4);
        Sala sala5 = new Sala(5);

        Heroe gerrero1 = new Heroe("Felix", TipoHeroe.GUERRERO);
        Heroe mago1 = new Heroe("Jesus", TipoHeroe.MAGO);
        Heroe arquero1 = new Heroe("Moha", TipoHeroe.ARQUERO);

        Item pocionPequena1 = new Item("Pocion pequeña", TipoItem.POCION_PEQUENA);
        Item pocionPequena2 = new Item("Pocion pequeña", TipoItem.POCION_PEQUENA);
        Item pocionGrande1 = new Item("Pocion grande", TipoItem.POCION_GRANDE);
        Item pocionElixir1 = new Item("Elixir", TipoItem.ELIXIR);

     }


     public void jugar(){

     }

     public void enEntreSalas(){

        do {
           IO.println("Menú entre salas");
            IO.println("1. VerEquipo");
            IO.println("2. UsarPociones");
            IO.println("3. Descansar");
            IO.println("4. Continuar");

            switch (true) {
                case 1 :
                    IO.println("Este es el Equipo Actual");
                    IO.println(equipo);
                case 2:
                    IO.println("Que pocion quieres usar");

                case 3:


                case 4;


            }

        }while(true);

     }


}
