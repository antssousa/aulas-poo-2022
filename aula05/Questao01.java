import java.util.Scanner;

public class Questao01 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Digite a velocidade");
    double vel = read.nextDouble();
    double multa = 0;
    if (vel > 80) {
      multa = (vel - 80) * 5;
      System.out.println("Você foi multado em R$ " + multa);
    } else {
      System.out.println("Parabéns voce e um bom motorista");
    }
  }
}