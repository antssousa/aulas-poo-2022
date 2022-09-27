import java.util.Scanner;

public class Questao02 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    double salario, aumento, novoSalario; // Declaração
    System.out.println("Digite o salario");
    salario = read.nextDouble();
    if (salario > 1250) {
      aumento = salario * 10 / 100;
    } else {
      aumento = salario * 15 / 100;
    }
    novoSalario = salario + aumento;
    System.out.println("O aumento e R$ " + aumento);
    System.out.println("O novo salario e R$ " + novoSalario);
  }
}
