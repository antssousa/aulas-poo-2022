import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a velocidade");
            double vel = new Scanner(System.in).nextDouble();
            if (vel > 60) {
                double multa = (vel - 60) * 10;
                System.out.println("O valor da multa é R$ " + multa);
            } else {
                System.out.println("Parabéns você é um bom motorista :-)");
            }
        }
    }
}
