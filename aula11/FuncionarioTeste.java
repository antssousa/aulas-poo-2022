import java.util.ArrayList;
import java.util.Scanner;

public class FuncionarioTeste {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do Gerente");
        String nome = scan.nextLine();
        System.out.println("Digite a matricula do Gerente");
        String matricula = scan.nextLine();
        System.out.println("Digite o salario base do Gerente");
        double salarioBase = scan.nextDouble();
        scan.nextLine();
        Funcionario g1 = new Gerente(nome, matricula, salarioBase);
        funcionarios.add(g1);
        Funcionario a1 = new Assistente();
        System.out.println("Digite o nome do Assistente");
        a1.setNome(scan.nextLine());
        System.out.println("Digite a matricula do Assistente");
        a1.setMatricula(scan.nextLine());
        System.out.println("Digite o salario base do Assistente");
        a1.setSalarioBase(scan.nextDouble());
        scan.nextLine();
        funcionarios.add(a1);
        Vendedor v1 = new Vendedor();
        System.out.println("Digite o nome do Vendedor");
        v1.setNome(scan.nextLine());
        System.out.println("Digite a matricula do Vendedor");
        v1.setMatricula(scan.nextLine());
        System.out.println("Digite o salario base do Vendedor");
        v1.setSalarioBase(scan.nextDouble());
        System.out.println("Digite o valor da comissao do Vendedor");
        v1.setComissao(scan.nextDouble());
        funcionarios.add(v1);

        double folha = 0;
        System.out.println("---------------------------");
        for (Funcionario f : funcionarios) {
            folha = folha + f.calcularSalario();
            System.out.println(f);
        }
        System.out.printf("A folha de pagamento e: R$ %.2f", folha);
    }
}