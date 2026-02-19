package AventuraEnLaMazmorra.app;

import AventuraEnLaMazmorra.Servicios.Juego;
import AventuraEnLaMazmorra.entidades.Enemigo;
import AventuraEnLaMazmorra.entidades.Sala;
import AventuraEnLaMazmorra.entidades.TipoEnemigo;

public class Main {

    static void main(String[] args) {

        Juego juego = new Juego();
        juego.inicializarJuego();
        juego.jugar();
    }
}
