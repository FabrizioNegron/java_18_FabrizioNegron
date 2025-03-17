package Actividad5;

public class Principal {

    public Principal() {
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Fabrizio Negron", (double) 3000.0F);
        empleado1.mostrarInformacion();
        empleado1.aumentarSalario((double) 10.0F);
        empleado1.mostrarInformacion();
    }
}
