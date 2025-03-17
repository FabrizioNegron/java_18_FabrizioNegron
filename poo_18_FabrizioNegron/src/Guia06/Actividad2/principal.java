
package Guia06.Actividad2;

/**
 *
 * @author jeffe
 */
public class principal {
     public principal() {
    }

    public static void main(String[] args) {
        Coche_18 miCoche = new Coche_18();
        miCoche.color = "Rojo";
        miCoche.velocidadMaxima = 200;
        miCoche.arrancar();
        miCoche.acelerar();
    }
}
