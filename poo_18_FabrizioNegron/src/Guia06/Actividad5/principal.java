package Guia06.Actividad5;

public class principal {

    public principal() {
    }

    public static void main(String[] args) {
        Empleado_18 empleado1 = new Empleado_18("Fabrizio Negron", (double) 3000.0F);
        empleado1.mostrarInformacion();
        empleado1.aumentarSalario((double) 10.0F);
        empleado1.mostrarInformacion();
    }
}
