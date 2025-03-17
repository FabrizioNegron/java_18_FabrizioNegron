package Actividad4;

public class Rectangulo {

    double largo;
    double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double calcularArea(double largo, double ancho) {
        return largo * ancho;
    }

    public double calcularPerimetro(double largo, double ancho) {
        return (double) 2.0F * (largo + ancho);
    }
}
