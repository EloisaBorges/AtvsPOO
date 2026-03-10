public class Main {
    public static void main(String[] args) {
       
        Poligono meuQuadrado = new Quadrado(5);
        System.out.println("Quadrado:");
        System.out.println("Área: " + meuQuadrado.calcularArea());
        System.out.println("Perímetro: " + meuQuadrado.calcularPerimetro());

        Poligono meuTriangulo = new TrianguloEquilatero(5);
        System.out.println("\nTriângulo:");
        System.out.println("Área: " + meuTriangulo.calcularArea());
        System.out.println("Perímetro: " + meuTriangulo.calcularPerimetro());
    }
}
