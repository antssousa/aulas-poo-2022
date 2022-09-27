import java.util.Scanner;

public class VeiculoTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Veiculo v1 = new Veiculo();
        System.out.println("Digite o modelo do carro");
        v1.setModelo(scan.nextLine());
        System.out.println("Digite a cor do carro");
        v1.setCor(scan.nextLine());
        System.out.println("Digite o ano do carro");
        v1.setAno(scan.nextInt());
        System.out.println("------------------");
        System.out.println("O modelo do carro e " + v1.getModelo());
        System.out.println("------------------");
        System.out.println(v1);

    }
}
