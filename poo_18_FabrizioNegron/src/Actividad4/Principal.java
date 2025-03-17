package Actividad4;

public class Principal {

    public Principal() {
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo((double) 5.0F, (double) 3.0F);
        System.out.println("Área: " + rectangulo.calcularArea((double) 5.0F, (double) 3.0F));
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro((double) 5.0F, (double) 3.0F));
    }
}
