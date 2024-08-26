package FIGURAS;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada figura
        Figura triangulo = new Triangulo(5, 10);
        Figura rectangulo = new Rectangulo(4, 8);
        Figura circulo = new Circulo(3);

        // Calcular y mostrar las áreas
        System.out.println("Área del Triángulo: " + triangulo.calcularArea());
        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del Círculo: " + circulo.calcularArea());
    }
}

