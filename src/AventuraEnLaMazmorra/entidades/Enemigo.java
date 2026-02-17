package AventuraEnLaMazmorra.entidades;

public class Enemigo extends Personaje{

    private TipoEnemigo tipo;
    private Integer expOtorgada;

    public Enemigo(String nombre, Integer puntosVidaMax, Integer puntosVidaActual, Integer ataque, Integer defensa, boolean vivo, Integer expOtorgada, TipoEnemigo tipo) {
        super(nombre, puntosVidaMax, puntosVidaActual, ataque, defensa, vivo);
        this.expOtorgada = expOtorgada;
        this.tipo = tipo;

        this.iniTipoEnemigo();
    }

    public TipoEnemigo getTipo() {
        return tipo;
    }

    public void setTipo(TipoEnemigo tipo) {
        this.tipo = tipo;
    }

    public Integer getExpOtorgada() {
        return expOtorgada;
    }

    public void setExpOtorgada(Integer expOtorgada) {
        this.expOtorgada = expOtorgada;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Enemigo{");
        sb.append("tipo=").append(tipo);
        sb.append(", expOtorgada=").append(expOtorgada);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", puntosVidaActual=").append(puntosVidaActual);
        sb.append(", puntosVidaMax=").append(puntosVidaMax);
        sb.append(", ataque=").append(ataque);
        sb.append(", defensa=").append(defensa);
        sb.append(", vivo=").append(vivo);
        sb.append('}');
        return sb.toString();
    }

    private void iniTipoEnemigo() {
        switch (tipo) {
            case GOBLIN:
                this.puntosVidaMax = 30;
                this.puntosVidaActual = 30;
                this.ataque = 8;
                this.defensa = 3;
                this.expOtorgada = 20;
                break;
            case ORCO:
                this.puntosVidaMax = 60;
                this.puntosVidaActual = 60;
                this.ataque = 15;
                this.defensa = 8;
                this.expOtorgada = 40;
                break;
            case DRAGON:
                this.puntosVidaMax = 150;
                this.puntosVidaActual = 150;
                this.ataque = 25;
                this.defensa = 12;
                this.expOtorgada = 100;
                break;
        }
    }

    //-----------METODOS--------------






}
