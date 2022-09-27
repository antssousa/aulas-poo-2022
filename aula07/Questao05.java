import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase = scan.nextLine();
        System.out.println("Digite uma palavra");
        String palavra = scan.nextLine();
        int index = frase.indexOf(palavra);
        if (index == -1) {
            System.out.println(palavra + " nao foi encontrada");
        } else {
            System.out.println(palavra + " foi encontrada na posicao " + index);
        }
    }
}
