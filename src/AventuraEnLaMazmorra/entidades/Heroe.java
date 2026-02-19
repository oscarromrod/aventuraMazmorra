package AventuraEnLaMazmorra.entidades;

import java.util.ArrayList;

public class Heroe extends Personaje{

    //Atributos
    private TipoHeroe tipo;
    private Integer nivel;
    private Integer experiencia;
    private ArrayList<Item> inventario;


    public Heroe(String nombre, TipoHeroe tipo) {
        super(nombre);
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
        switch (this.tipo) {
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



    public void ganarExperiencia(int exp) {

        this.experiencia += exp ;

        if(this.nivel >= 100) {
            this.subirNivel();

        }

    }


    public void subirNivel() {

        this.experiencia = 0;
        this.nivel++;

        this.puntosVidaMax +=  20;
        this.ataque += 5 ;
        this.defensa += 3 ;

        this.puntosVidaActual = this.puntosVidaMax ;
    }


    public void usarItem(Item item) {

        for (Item usarInventario: this.inventario) {

            if (usarInventario.equals(item)) {


                usarInventario.usar(this);

                this.inventario.remove(item);

            }

        }
    }

    @Override
    public void usarHabilidadEspecial(Personaje objetivo, ArrayList<Personaje> personajes) {
        switch (this.tipo) {
            case GUERRERO:
                int damage = (this.ataque - objetivo.defensa) * 2 ;

                if (damage <= 1) {
                    damage = 1 ;
                }

                objetivo.recibirDanio(damage);


                break;
            case MAGO:

                for (Personaje obj : personajes) {
                    obj.recibirDanio(this.ataque);
                }

                break;
            case ARQUERO:

                objetivo.recibirDanio(this.ataque);
                break;
        }
    }
}
