package AventuraEnLaMazmorra.entidades;

public abstract class Personaje {

    protected String nombre;
    protected Integer puntosVidaMax;
    protected Integer puntosVidaActual;
    protected Integer ataque;
    protected Integer defensa;
    protected boolean vivo;

    public Personaje(String nombre, Integer puntosVidaMax, Integer puntosVidaActual, Integer ataque, Integer defensa, boolean vivo) {
        this.nombre = nombre;
        this.puntosVidaMax = puntosVidaMax;
        this.puntosVidaActual = puntosVidaActual;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vivo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPuntosVidaMax() {
        return puntosVidaMax;
    }

    public void setPuntosVidaMax(Integer puntosVidaMax) {
        this.puntosVidaMax = puntosVidaMax;
    }

    public Integer getPuntosVidaActual() {
        return puntosVidaActual;
    }

    public void setPuntosVidaActual(Integer puntosVidaActual) {
        this.puntosVidaActual = puntosVidaActual;
    }

    public Integer getDefensa() {
        return defensa;
    }

    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", puntosVidaMax=").append(puntosVidaMax);
        sb.append(", puntosVidaActual=").append(puntosVidaActual);
        sb.append(", ataque=").append(ataque);
        sb.append(", defensa=").append(defensa);
        sb.append(", vivo=").append(vivo);
        sb.append('}');
        return sb.toString();
    }

    //---------------METODOS-----------------

    public void atacar(Personaje objetivo){

    }

    public void recibirDanio(Integer danio){

    }

    public void curar(int cantidad){
        if (this.puntosVidaActual > 0 ){
            this.puntosVidaActual *= cantidad;
        }

    }

    public boolean estaVivo(){
        if (this.vivo){
            return true;
        }
        return false;
    }

    public void atacar(Personaje objetivo){

    }

    public void recibirDanio(Integer danio){

    }

    public void curar(int cantidad){
        if (this.puntosVidaActual > 0 ){
            this.puntosVidaActual *= cantidad;
        }
    }

    public boolean estaVivo(){
        if (this.vivo){
            return true;
        }
        return false;
    }

    public void usarHabilidadEspecial(Personaje objetivo) {

    }
}
