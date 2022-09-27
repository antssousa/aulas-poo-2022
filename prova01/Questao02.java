package prova01;

import java.util.Scanner;

public class Questao02 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Digite o valor em metros");
    double metro = read.nextDouble();
    double cm = metro * 100;
    System.out.println(metro + " m = " + cm + " cm");
  }
}
