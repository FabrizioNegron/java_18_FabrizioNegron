package Guia06.Actividad3;

public class Rectangulo_18 {

    double largo;
    double ancho;

    public Rectangulo_18() {
    }

    public void asignarLargo(double largo) {
        this.largo = largo;
    }

    public void asignarAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea() {
        return this.largo * this.ancho;
    }

    public double calcularPerimetro() {
        return (double) 2.0F * (this.largo + this.ancho);
    }

    public void mostrarInformacion() {
        System.out.println("Largo: " + this.largo);
        System.out.println("Ancho: " + this.ancho);
        System.out.println("Área: " + this.calcularArea());
        System.out.println("Perímetro: " + this.calcularPerimetro());
    }
}
