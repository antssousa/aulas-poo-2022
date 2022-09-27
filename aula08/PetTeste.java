import java.util.Scanner;

public class PetTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pet p1 = new Pet();
        System.out.println("Digite o nome do Pet");
        p1.setNome(scan.nextLine());
        System.out.println("Digite a idade do Pet");
        p1.setIdade(scan.nextInt());
        scan.nextLine(); // Corrigir um bug do Scanner
        System.out.println("Digite a raca do Pet");
        p1.setRaca(scan.nextLine());
        System.out.println(p1);
        System.out.println("--------------------");
        System.out.println("Digite o nome do Pet");
        String nome = scan.nextLine();
        System.out.println("Digite a idade do Pet");
        int idade = scan.nextInt();
        scan.nextLine(); // Corrigir um bug do Scanner
        System.out.println("Digite a raca do Pet");
        String raca = scan.nextLine();
        Pet p2 = new Pet(nome, idade, raca);
        System.out.println(p2);
    }
}
