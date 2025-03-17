package Guia06.Actividad4;

public class principal {

    public principal() {
    }

    public static void main(String[] args) {
        Rectangulo_18 rectangulo = new Rectangulo_18((double) 5.0F, (double) 3.0F);
        System.out.println("Área: " + rectangulo.calcularArea((double) 5.0F, (double) 3.0F));
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro((double) 5.0F, (double) 3.0F));
    }
}
