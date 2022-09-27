import java.util.Scanner;

public class Questao04 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Digite um numero");
    double n1 = read.nextDouble();
    System.out.println("Digite outro numero");
    double n2 = read.nextDouble();
    System.out.println("+ = soma");
    System.out.println("- = subtracao");
    System.out.println("* = multiplicacao");
    System.out.println("/ = divisao");
    String op = read.next();
    if (op.equals("+")) {
      System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
    } else if (op.equals("-")) {
      System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
    } else if (op.equals("*")) {
      System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
    } else if (op.equals("/")) {
      System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
    } else {
      System.out.println("Opção invalida");
    }
  }
}
