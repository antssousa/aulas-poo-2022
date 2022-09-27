import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = scan.nextLine();
        System.out.println("-----------------");
        for (int i = 0; i < texto.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(texto.charAt(j));
            }
            System.out.println();
        }
        System.out.println("------------"); // 😭
        String res = "";
        for (int i = 0; i < texto.length(); i++) {
            res += texto.charAt(i); // res = res + texto.charAt(i)
            System.out.println(res);
        }
    }
}
