/* Escreva um algoritmo que receba dez números do usuário e armazene em um vetor,
procure no vetor o maior número digitado e exiba-o. */
import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[10];
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um numero para a posicao " + i);
            vetor[i] = scan.nextInt();
        }
        
        int maior = vetor[0];

        for(int i = 1; i < vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        System.out.println("O Maior numero e " + maior);
    
    }
}
