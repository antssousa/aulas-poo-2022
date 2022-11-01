public class Retangulo extends Quadrilatero {

    public Retangulo(double base, double altura) {
        super(base, base, altura, altura);
    }

    public Retangulo() {
    }

    @Override
    public double area() {
        return getLado1() * getLado3();
    }

    @Override
    public String toString() {
        return "Retangulo";
    }
}
