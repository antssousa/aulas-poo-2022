import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = scan.nextLine();
        String[] txts = texto.split(" ");
        int tam = txts.length;
        System.out.println("O tamanho do texto digitado e: " + texto.length());
        System.out.println("O tamanho do texto digitado sem espacos: " + (texto.length() - tam + 1));
        System.out.println(String.join("", txts).length());
        int qtd = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != ' ') {
                qtd++;
            }
        }
        System.out.println(qtd);
    }
}