import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um texto");
        String texto = scan.nextLine();
        System.out.println("Digite a palavra que deseja substituir");
        String palavra = scan.next();
        System.out.println("Digite a nova palavra");
        String outra = scan.next();
        System.out.println(texto.replaceAll(palavra, outra));
    }
}
