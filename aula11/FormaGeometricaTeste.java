import java.net.SocketTimeoutException;
import java.util.Scanner;

public class FormaGeometricaTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantas formas geometricas voce quer ver: ");
        int quant = scan.nextInt();
        FormaGeometrica[] formas = new FormaGeometrica[quant];

        for (int i = 0; i < quant; i++) {
            System.out.println("Menu");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retangulo");
            System.out.println("3 - Circulo");
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o lado do quadrado: ");
                    double lado = scan.nextDouble();
                    formas[i] = new Quadrado(lado);
                    break;
                case 2:
                    System.out.println("Digite a base do retangulo: ");
                    double base = scan.nextDouble();
                    System.out.println("Digite a altura do retangulo: ");
                    double altura = scan.nextDouble();
                    formas[i] = new Retangulo(base, altura);
                    break;
                case 3:
                    System.out.println("Digite o raio do circulo: ");
                    double raio = scan.nextDouble();
                    formas[i] = new Circulo(raio);
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        }
        for (FormaGeometrica forma : formas) {
            System.out.println(forma + "tem area de " + forma.area() + " e perimetro de  " + forma.perimetro());
        }

    }
}
