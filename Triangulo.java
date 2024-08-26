package FIGURAS;

class Triangulo extends Figura {
    private double base;
    private double altura;

    // Constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Sobrescritura del método calcularArea
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

