import java.util.Scanner;

public class Questao02a {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Digite um numero");
    int n = read.nextInt();
    for (int i = 2; i <= n; i = i + 2) {
      System.out.println(i);
    }
  }
}
