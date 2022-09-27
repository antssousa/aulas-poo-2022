import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Questao01a {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Digite a velocidade");
    double vel = read.nextDouble();
    if (vel > 60) {
      double multa = (vel - 60) * 10;
      System.out.println("O valor da multa é R$ " + multa);
    } else {
      System.out.println("Parabéns você é um bom motorista :-)");
    }
  }
}
