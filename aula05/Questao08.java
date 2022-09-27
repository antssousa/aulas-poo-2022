import java.util.Scanner;
public class Questao08{
  public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    System.out.println("Digite um numero");
    int n = read.nextInt();
    int i = 1;
    while (i <= 10){
      System.out.println(i + " x " + n + " = " + (i * n));
      i++; // i += 1 ou i = i + 1
    }
  }
}