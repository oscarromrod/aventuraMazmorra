package AventuraEnLaMazmorra.Servicios;

import AventuraEnLaMazmorra.entidades.*;
import com.sun.java.accessibility.util.GUIInitializedListener;

import java.awt.color.CMMException;
import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    //https://code-with-me.global.jetbrains.com/fuasFiVl-bO4tdgW8izzpA

    //-------Atributos-----------

    private ArrayList<Heroe> equipo = new ArrayList<>();
    private ArrayList<Sala> salas = new ArrayList<>();
    private Integer SalaActual = 1;
    private Boolean juegoTerminado;
    int opcion = 0;
    Scanner sc = new Scanner(System.in);








    //------------METODOS--------------

     public void inicializarJuego(){

        Sala sala1 = new Sala(1);
        Sala sala2 = new Sala(2);
        Sala sala3 = new Sala(3);
        Sala sala4 = new Sala(4);
        Sala sala5 = new Sala(5);

        IO.println("Generando salas ...");
        salas.add(sala1);
        salas.add(sala2);
        salas.add(sala3);
        salas.add(sala4);
        salas.add(sala5);


        Heroe guerrero1 = new Heroe("Felix", TipoHeroe.GUERRERO);
        Heroe mago1 = new Heroe("Jesus", TipoHeroe.MAGO);
        Heroe arquero1 = new Heroe("Moha", TipoHeroe.ARQUERO);

        IO.println("Creando equipo predetrminado ...");
        equipo.add(guerrero1);
        equipo.add(mago1);
        equipo.add(arquero1);

        Item pocionPequena = new Item("Pocion pequeña", TipoItem.POCION_PEQUENA);
        Item pocionGrande = new Item("Pocion grande", TipoItem.POCION_GRANDE);
        Item pocionElixir = new Item("Elixir", TipoItem.ELIXIR);

        IO.println("Agregando pociones al inventario ...");
        guerrero1.agregarItemInventario(pocionPequena);
        guerrero1.agregarItemInventario(pocionGrande);
        guerrero1.agregarItemInventario(pocionElixir);

        mago1.agregarItemInventario(pocionPequena);
        mago1.agregarItemInventario(pocionGrande);
        mago1.agregarItemInventario(pocionElixir);

        arquero1.agregarItemInventario(pocionPequena);
        arquero1.agregarItemInventario(pocionGrande);
        arquero1.agregarItemInventario(pocionElixir);

     }


     public void jugar(){
        IO.println("Dime una opcion 1 - 5" );
        IO.println("1. Mostrar menu entre salas");
        IO.println("2.Entrar en la sala actual");
        IO.println("3.Iniciar combate");
        IO.println("4.Verificar resultado");
        IO.println("5. Avanzar a la siguiente sala");
        opcion = sc.nextInt();


        do {

            switch (opcion) {

                case 1 -> {
                    if (SalaActual != 1) {
                        enEntreSalas();
                        continue;
                    }
                }
                case 2 -> {
                    salas.get(SalaActual);
                }
                case 3 -> {
                    for (int i = 0; i < salas.size(); i++) {
                        Combate combate1 = new Combate(salas.get(i), equipo);
                        combate1.iniciarCombate();
                        SalaActual = i;
                    }

                }
                case 4 -> {


                }

            }
        }while (opcion != 1);
        opcion = 0;
     }

     public void enEntreSalas(){

        do {
           IO.println("Menú entre salas");
            IO.println("1. VerEquipo");
            IO.println("2. UsarPociones");
            IO.println("3. Descansar");
            IO.println("4. Continuar");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 :
                    IO.println("Este es el Equipo Actual");
                    IO.println(equipo);
                case 2:
                    IO.println("Que pocion quieres usar");


                case 3:
                    IO.println("Ahora se descansa");
                    for (Heroe equipo: equipo )
                        equipo.curar(20);

                case 4:
                    jugar();
                    opcion = 5;

                default:
                    IO.println("Numero incorrecto");

            }

        }while (opcion != 5);
        opcion=0;

     }



    //-----Comprueba si hay algun heroe vivo-------
    private boolean hayHeroeVivo() {
        for(Heroe heroes : this.equipo) {
            if (heroes.estaVivo()) {
                return true;
            }
        }
        return false;
    }


     public void mosrtarResultadoFInal(){
        IO.println("JUEGO TERMINADO");
        if (this.hayHeroeVivo()){
            IO.println("Los heroes ganan");
        } else {
            IO.println("Los enemigos ganan");
        }
     }


}
