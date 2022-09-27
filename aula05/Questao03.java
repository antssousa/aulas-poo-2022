import java.util.Scanner;

public class Questao03 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Digite a distancia da sua viagem");
    double dist = read.nextDouble();
    double passagem = 0;
    if (dist > 200) {
      passagem = dist * 0.45;
    } else {
      passagem = dist * 0.50;
    }
    System.out.println("A passagem custou R$ " + passagem);
  }
}
