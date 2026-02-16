package AventuraEnLaMazmorra.entidades;

public class Item {

    private String nombre;
    private TipoItem tipo;
    private int valorCuracion;

    public Item(String nombre,TipoItem tipo,int valorCuracion) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.valorCuracion = valorCuracion;

        if (tipo == TipoItem.POCION_PEQUENA) {
            this.nombre = "Poción Pequeña";
            this.valorCuracion = 30;

        } else if (tipo == TipoItem.POCION_GRANDE) {
            this.nombre = "Poción Grande";
            this.valorCuracion = 60;

        } else {
            this.nombre = "Elixir";
            this.valorCuracion = -1;
        }
    }


}



