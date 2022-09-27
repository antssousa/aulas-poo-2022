import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		double b, a, res;
		Scanner sc = new Scanner(System.in);		
		System.out.print("Digite um valor: ");
		b = sc.nextDouble();
		System.out.print("Digite outro valor: ");
		a = sc.nextDouble();		
		res = (b * a) / 2;		
		System.out.println("O resultado é " + res);
	}
}
