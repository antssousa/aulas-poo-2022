import java.util.Scanner;

public class Questao05 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Digite o salario");
    double sal = read.nextDouble();
    System.out.println("Digite o valor da casa");
    double valorCasa = read.nextDouble();
    System.out.println("Digite a quantidade de anos");
    int ano = read.nextInt();
    double parcela = valorCasa / (ano * 12);
    if (parcela > (sal * 30 / 100)) {
      System.out.println("Nada feito");
    } else {
      System.out.println("Parabens voce adiquiriu uma casa");
    }
  }
}
