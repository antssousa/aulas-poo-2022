import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o numero da posicao " + i);
            a[i] = scan.nextInt();
            b[i] = a[i] * 2;
        }

        System.out.println("--------------");
        System.out.println("Vetor A");
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("--------------");
        System.out.println("Vetor B");
        System.out.print("[");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.print("]");
    }
}
