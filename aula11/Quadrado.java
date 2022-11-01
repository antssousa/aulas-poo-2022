public class Quadrado extends Quadrilatero {

    public Quadrado(double lado) {
        super(lado, lado, lado, lado);
    }

    public Quadrado() {
    }

    @Override
    public double area() {
        return getLado1() * getLado1();
    }

    @Override
    public String toString() {
        return "Quadrado";
    }

}
