import java.util.Scanner;

public class Questao09 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Digite o deposito inicial");
    double dep = read.nextDouble();
    System.out.println("Digite a taxa de juros");
    double tx = read.nextDouble();
    double montante = dep;
    int i = 1;
    do {
      double juros = montante * tx / 100;
      montante = montante + juros;
      System.out.println("O juros no mês " + i + " e R$ " + juros);
      i++;
    } while (i <= 24);
    System.out.println("O montante final e R$ " + montante);
  }
}