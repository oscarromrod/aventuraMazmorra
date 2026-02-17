package AventuraEnLaMazmorra.entidades;

public class Item{

    private String nombre;
    private TipoItem tipo;
    private int valorCuracion;

    public Item(String nombre,TipoItem tipo) {
        super();
        this.nombre = nombre;
        this.tipo = tipo;

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Item{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", valorCuracion=").append(valorCuracion);
        sb.append('}');
        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public TipoItem getTipo() {
        return tipo;
    }

    public int getValorCuracion() {
        return valorCuracion;
    }

    //------Metodos------

    public void usar(Heroe heroe) {

        if (tipo == TipoItem.POCION_PEQUENA) {
            valorCuracion = 30;
            System.out.println(heroe.getNombre() + " usa una Poción Pequeña y recupera 30 HP.");

        } else if (tipo == TipoItem.POCION_GRANDE) {
            valorCuracion = 60;
            System.out.println(heroe.getNombre() + " usa una Poción Grande y recupera 60 HP.");

        } else if (tipo == TipoItem.ELIXIR) {
            int vidaFaltante = heroe.getPuntosVidaMax() - heroe.getPuntosVidaActual();
            System.out.println(heroe.getNombre() + " usa un Elixir y se cura completamente.");
        }
    }

}



