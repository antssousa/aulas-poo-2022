import java.util.Scanner;

public class Leitura {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Digite seu nome");
    String nome = read.nextLine();
    System.out.println("Oi," + nome + "!");
  }
}