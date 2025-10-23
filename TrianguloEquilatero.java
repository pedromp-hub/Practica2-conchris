// Archivo: TrianguloEquilatero.java
public class TrianguloEquilatero {
    // Atributo: longitud del lado del triángulo
    private double lado;

    // Constructor
    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 3 * lado;
    }

    // Método para calcular el área
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un triángulo equilátero con lado 5
        TrianguloEquilatero t = new TrianguloEquilatero(5);

        // Mostrar resultados
        System.out.println("Lado del triángulo: " + t.lado);
        System.out.println("Perímetro: " + t.calcularPerimetro());
        System.out.println("Área: " + t.calcularArea());
    }
}
