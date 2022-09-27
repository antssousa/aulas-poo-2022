public class Questao06 {
    public static void main(String[] args) {
        int[] n = new int[10];

        for (int i = 1, j = 0; i <= 20; i++) {
            if (i % 2 == 1) {
                n[j] = i * i; // n[i] = Math.pow(i, 2)
                j++;
            }
        }
        System.out.print("[");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.print("]");
    }
}
