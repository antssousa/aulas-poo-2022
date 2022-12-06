import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir");
        System.out.print("Informe o primeiro valor: ");
        int x, y;

        try {
            x = teclado.nextInt();
            System.out.print("Informe o segundo valor: ");
            y = teclado.nextInt();
            double r = (x / y);
            System.out.println("O resultado da divisao e " + r);
        } catch (InputMismatchException e) {
            System.out.println("Erro na digitacao do numero ");
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erro por divisao por zero");
            System.out.println(e.getMessage());
        }
    }
}
