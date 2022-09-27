public class Prova {
  public static void main(String[] args) {
    int i = 10, j = 3, k = 2, m = 5;
    System.out.println(i == 1);
    System.out.println(j == 3);
    System.out.println(i >= 1 && j < 4);
    System.out.println(m <= 99 && k < m);
    System.out.println(j >= i || k == m);
    System.out.println(m < j || j >= k);
    System.out.println(!(k > m));
  }
}