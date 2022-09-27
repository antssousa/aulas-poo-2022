/* Escreva um algoritmo que armazene em um vetor todos os 10 primeiros múltiplos de 5.
Após isso, o algoritmo deve imprimir todos os valores armazenados. */
public class Questao08 {
    public static void main(String[] args) {
        int[] n = new int[10];
        for (int i = 0; i < n.length; i++) {
            n[i] = i * 5;
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
