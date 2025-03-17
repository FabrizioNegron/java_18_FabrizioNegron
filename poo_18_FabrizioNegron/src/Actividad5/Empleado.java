package Actividad5;

public class Empleado {

    String nombre;
    double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentaje) {
        if (porcentaje > (double) 0.0F) {
            this.salario += this.salario * (porcentaje / (double) 100.0F);
            System.out.println("Salario aumentado en " + porcentaje + "%.");
        } else {
            System.out.println("El porcentaje debe ser positivo.");
        }

    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Salario: " + this.salario);
    }
}
