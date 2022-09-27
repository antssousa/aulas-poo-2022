import java.util.Scanner;

public class Questao01b {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Digite o salario");
    double sal = read.nextDouble();
    double aum = 0, novo = 0;
    if (sal > 2000) {
      aum = sal * 15 / 100;
    } else {
      aum = sal * 25 / 100;
    }
    novo = sal + aum;
    System.out.println("O aumento foi de R$ " + aum);
    System.out.println("O novo salario e de R$ " + novo);
  }
}
