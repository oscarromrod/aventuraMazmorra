package AventuraEnLaMazmorra.entidades;

import java.util.ArrayList;

public class Sala {

    private Integer numeroSala;
    private ArrayList<Enemigo> enemigos = new ArrayList<>();
    private Boolean completada;

    public Sala(Integer numeroSala) {
        this.numeroSala = numeroSala;
        this.generarEnemigos();
        this.completada = false;
    }

    public void generarEnemigos(){
        switch (numeroSala){
            case 1,2 -> {
                int num = (int)(Math.random() * 2) + 2;
                if (num == 2){
                    Enemigo glb1 = new Enemigo("Paco",TipoEnemigo.GOBLIN);
                    Enemigo glb2 = new Enemigo("Paco2",TipoEnemigo.GOBLIN);
                }else if (num == 3){
                    Enemigo glb1 = new Enemigo("Paco",TipoEnemigo.GOBLIN);
                    Enemigo glb2 = new Enemigo("Paco2",TipoEnemigo.GOBLIN);
                    Enemigo glb3 = new Enemigo("Paco3",TipoEnemigo.GOBLIN);
                }

            }
            case 3,4 ->{
                int num = (int)(Math.random() * 2) + 1;

                if (num == 1){
                    Enemigo Orco = new Enemigo("Paco",TipoEnemigo.ORCO);
                    Enemigo glb2 = new Enemigo("Paco2",TipoEnemigo.GOBLIN);
                }else if (num == 2){
                    Enemigo glb1 = new Enemigo("Paco",TipoEnemigo.GOBLIN);
                    Enemigo Orco = new Enemigo("Paco2",TipoEnemigo.ORCO);
                    Enemigo Orco1 = new Enemigo("Paco3",TipoEnemigo.ORCO);
                }

            }
            case 5 -> {
                Enemigo Dragon = new Enemigo("Paco",TipoEnemigo.DRAGON);
                Enemigo Orco = new Enemigo("Paco2",TipoEnemigo.ORCO);
                Enemigo Orco1 = new Enemigo("Paco3",TipoEnemigo.ORCO);

            }

        }

    }
    public Boolean todosENemigosMuertos(Enemigo enemigo){
        if (){
            return true;
        }
        return false;
    }

}
