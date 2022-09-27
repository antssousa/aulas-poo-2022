import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] alturas = new double[10];
        double soma = 0, media;

        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Digite a altura do atleta " + i);
            alturas[i] = scan.nextDouble();
            soma += alturas[i];
            // soma = soma + alturas[i];
        }
        media = soma / alturas.length;
        System.out.println("A media das alturas e " + media);
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > media) {
                System.out.println("O atleta " + i + " tem altura de " + alturas[i]);
            }
        }

    }
}
