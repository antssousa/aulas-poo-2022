import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primeiroNumero, segundoNumero, diferenca;
        System.out.print("Digite o primeiro número:  ");
        primeiroNumero = entrada.nextInt();
        System.out.print("Digite o segundo número:  ");
        segundoNumero = entrada.nextInt();
        if (primeiroNumero >= segundoNumero) {
            diferenca = primeiroNumero - segundoNumero;
        } else {
            diferenca = segundoNumero - primeiroNumero;
        }
        System.out.println("\nA diferença do maior para o menor é " + diferenca);
    }
}