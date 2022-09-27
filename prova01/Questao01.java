package prova01;

import java.util.Scanner;

public class Questao01 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Digite seu nome");
    String nome = read.next();
    System.out.println("Digite sua idade");
    int idade = read.nextInt();
    System.out.println(nome + " tem " + idade + " anos ");
  }
}
