import java.util.Scanner;

public class Questao02b {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Digite um numero");
    int n = read.nextInt();
    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
  }
}
