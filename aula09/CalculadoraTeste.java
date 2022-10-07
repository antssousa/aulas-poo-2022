import java.util.Scanner;

public class CalculadoraTeste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int n1 = scan.nextInt();
        System.out.println("Digite outro numero inteiro");
        int n2 = scan.nextInt();
        int resInt = Calculadora.soma(n1, n2);
        System.out.println("A soma e " + resInt);
        System.out.println("Digite um numero double");
        double d1 = scan.nextDouble();
        System.out.println("Digite outro numero double");
        double d2 = scan.nextDouble();
        double resDouble = Calculadora.soma(d1, d2);
        System.out.println("A soma e " + resDouble);

    }
}
