import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Digite um numero");
    double n1 = read.nextDouble();
    System.out.println("Digite outro numero");
    double n2 = read.nextDouble();
    double soma = n1 + n2;
    double sub = n1 - n2;
    double mult = n1 * n2;
    double div = n1 / n2;
    System.out.println("Soma: " + soma);
    System.out.println("Subtracao: " + sub);
    System.out.println("Multiplicacao: " + mult);
    System.out.println("Divisao: " + div);
  }
}
