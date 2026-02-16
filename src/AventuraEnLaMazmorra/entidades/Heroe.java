package AventuraEnLaMazmorra.entidades;

import java.util.ArrayList;

public class Heroe extends Personaje{

    //Atributos
    private TipoHeroe tipo;
    private Integer nivel;
    private Integer experiencia;
    private ArrayList<Item> inventario;


    public Heroe(String nombre, Integer puntosVidaMax, Integer puntosVidaActual, Integer ataque, Integer defensa, boolean vivo, TipoHeroe tipo) {
        super(nombre, puntosVidaMax, puntosVidaActual, ataque, defensa, vivo);
        this.tipo = tipo;

        this.nivel = 1;
        this.experiencia = 0;
        this.inventario = new ArrayList<>();

        this.iniTipoHeroe();


    }

    public TipoHeroe getTipo() {
        return tipo;
    }

    public void setTipo(TipoHeroe tipo) {
        this.tipo = tipo;
    }

    public Integer getNivel() {
        return nivel;
    }


    public Integer getExperiencia() {
        return experiencia;
    }


    public ArrayList<Item> getInventario() {
        return inventario;
    }

    /**
     *   Según el TipoHeroe, establece stats diferentes:
     *     GUERRERO: Vida alta (100), Ataque medio (20), Defensa alta (15)
     *     MAGO: Vida baja (60), Ataque alto (30), Defensa baja (5)
     *     ARQUERO: Vida media (80), Ataque medio (25), Defensa media
     *     (10)
     */
    private void iniTipoHeroe() {
        switch (tipo) {
            case GUERRERO:
                this.puntosVidaMax = 100;
                this.puntosVidaActual = 100;
                this.ataque = 20;
                this.defensa = 15;
                break;
            case MAGO:
                this.puntosVidaMax = 60;
                this.puntosVidaActual = 60;
                this.ataque = 30;
                this.defensa = 5;
                break;
            case ARQUERO:
                this.puntosVidaMax = 80;
                this.puntosVidaActual = 80;
                this.ataque = 25;
                this.defensa = 10;
                break;
        }
    }
}
