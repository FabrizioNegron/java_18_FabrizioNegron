package Actividad3;

public class Principal {

    public Principal() {
    }

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.asignarLargo((double) 5.0F);
        rectangulo1.asignarAncho((double) 3.0F);
        rectangulo1.mostrarInformacion();
    }
}
