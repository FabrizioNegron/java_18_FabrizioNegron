
package Guia06.Actividad2;

public class Coche_18 {
    String color;
    int velocidadMaxima;

    public Coche_18() {
    }

    public void arrancar() {
        System.out.println("El coche ha arrancado");
    }

    public void acelerar() {
        System.out.println("El coche está acelerando hasta " + this.velocidadMaxima + " km/h");
    }
}

