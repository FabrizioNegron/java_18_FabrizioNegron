
package Actividad2;

public class Coche {
    String color;
    int velocidadMaxima;

    public Coche() {
    }

    public void arrancar() {
        System.out.println("El coche ha arrancado");
    }

    public void acelerar() {
        System.out.println("El coche está acelerando hasta " + this.velocidadMaxima + " km/h");
    }
}

