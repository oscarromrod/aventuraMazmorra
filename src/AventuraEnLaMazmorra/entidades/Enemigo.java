package AventuraEnLaMazmorra.entidades;

public class Enemigo extends Personaje{

    private TipoEnemigo tipo;
    private Integer expOtorgada;

    public Enemigo(String nombre, Integer puntosVidaMax, Integer puntosVidaActual, Integer ataque, Integer defensa, boolean vivo, Integer expOtorgada, TipoEnemigo tipo) {
        super(nombre, puntosVidaMax, puntosVidaActual, ataque, defensa, vivo);
        this.expOtorgada = expOtorgada;
        this.tipo = tipo;
    }
}
