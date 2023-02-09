package clases;

import org.example.Heroe;

public class Villano {

    public String nombre;
    public int poder;
    public Heroe heroe;


    public int destruir(){
         int resultado = this.poder-this.heroe.getPoder();
         return resultado;
    }

}
