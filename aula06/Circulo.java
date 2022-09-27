public class Circulo {
    // Atributos
    double raio;

    // Métodos
    double calcularArea() {
        // return Math.PI * Math.pow(raio, 2);
        return 3.14 * raio * raio;
    }

    double calcularPerimetro() {
        return 2 * 3.14 * raio;
    }
}
