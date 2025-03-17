
package Actividad2;

/**
 *
 * @author jeffe
 */
public class Principal {
     public Principal() {
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.color = "Rojo";
        miCoche.velocidadMaxima = 200;
        miCoche.arrancar();
        miCoche.acelerar();
    }
}
