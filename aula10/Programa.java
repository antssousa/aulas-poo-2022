import java.util.Scanner;


public class Programa {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Pessoa p1 = new Pessoa("Joazinho Pereira", "Rua B", "869999999");
         * System.out.println(p1);
         * Pessoa f1 = new Fornecedor("Fernanda", "Rua A", "869999999", 15000, 20000);
         * System.out.println(f1);
         * Pessoa e1 = new Empregado("Analice", "Rua C", "8799999999", 10, 18000, 10);
         * System.out.println(e1);
         * Object a1 = new Administrador("Debora", "Rua D", "8899999999", 11, 50000, 15,
         * 2000);
         * System.out.println(a1);
         */
        Pessoa pessoas[] = new Pessoa[10];
        int contPessoas = 0;

        for (;;) {
            System.out.println("MENU");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Cadastrar Fornecedor");
            System.out.println("3 - Cadastrar Empregado");
            System.out.println("4 - Cadastrar Administrador");
            System.out.println("5 - Cadastrar Operario");
            System.out.println("6 - Cadastrar Vendedor");
            System.out.println("7 - Exibir cadastro");
            System.out.println("8 - Exibir o salario dos funcionarios");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opcao -->");
            int op = scan.nextInt();
            switch (op) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    if (contPessoas < 10) {
                        pessoas[contPessoas] = cadastrarPessoa();
                        contPessoas++;
                    } else {
                        System.out.println("Nao e possivel cadastrar mais pessoas");
                    }
                    break;
                case 2:
                    if (contPessoas < 10) {
                        pessoas[contPessoas] = cadastrarEmpregado();
                        contPessoas++;
                    } else {
                        System.out.println("Nao e possivel cadastrar mais pessoas");
                    }
                    break;
                case 3:
                    if (contPessoas < 10) {
                        pessoas[contPessoas] = cadastrarEmpregado();
                        contPessoas++;
                    } else {
                        System.out.println("Nao e possivel cadastrar mais pessoas");
                    }
                    break;
                case 4:
                    if (contPessoas < 10) {
                        pessoas[contPessoas] = cadastrarAdministrador();
                        contPessoas++;
                    } else {
                        System.out.println("Nao e possivel cadastrar mais pessoas");
                    }

                    break;
                case 5:
                    if (contPessoas < 10) {
                        pessoas[contPessoas] = cadastrarOperario();
                        contPessoas++;
                    } else {
                        System.out.println("Nao e possivel cadastrar mais pessoas");
                    }
                    break;
                case 6:
                    if (contPessoas < 10) {
                        pessoas[contPessoas] = cadastrarVendedor();
                        contPessoas++;
                    } else {
                        System.out.println("Nao e possivel cadastrar mais pessoas");
                    }
                    break;
                case 7:
                    for (int i = 0; i < contPessoas; i++) {
                        System.out.println("--------------------");
                        System.out.println(pessoas[i]);
                    }
                    break;
                case 8:
                    for (int i = 0; i < contPessoas; i++) {
                        System.out.println("--------------------");
                        System.out.println(pessoas[i].getNome() + " tem salario de R$ " + pessoas[i].calcularSalario());
                    }
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }
    }

    private static Vendedor cadastrarVendedor() {
        scan.nextLine();
        System.out.println("Digite o nome do Vendedor");
        String nome = scan.nextLine();
        System.out.println("Digite o endereco do Vendedor");
        String endereco = scan.nextLine();
        System.out.println("Digite o telefone da Vendedor");
        String telefone = scan.nextLine();
        System.out.println("Digite o codigo do setor do Vendedor");
        int codigoSetor = scan.nextInt();
        System.out.println("Digite o salario base do Vendedor");
        double salarioBase = scan.nextDouble();
        System.out.println("Digite o imposto do Vendedor");
        double imposto = scan.nextDouble();
        System.out.println("Digite o valor de venda do Vendedor");
        double valorProducao = scan.nextDouble();
        System.out.println("Digite a comissao do Vendedor");
        double comissao = scan.nextDouble();
        Vendedor v = new Vendedor(nome, endereco, telefone, codigoSetor, salarioBase, imposto, valorProducao, comissao);
        return v;
    }

    private static Pessoa cadastrarAdministrador() {
        scan.nextLine();
        System.out.println("Digite o nome do Administrador");
        String nome = scan.nextLine();
        System.out.println("Digite o endereco do Administrador");
        String endereco = scan.nextLine();
        System.out.println("Digite o telefone da Administrador");
        String telefone = scan.nextLine();
        System.out.println("Digite o codigo do setor do Administrador");
        int codigoSetor = scan.nextInt();
        System.out.println("Digite o salario base do Administrador");
        double salarioBase = scan.nextDouble();
        System.out.println("Digite o imposto do Administrador");
        double imposto = scan.nextDouble();
        System.out.println("Digite a ajuda de custo do Administrador");
        double ajudaDeCusto = scan.nextDouble();
        Administrador a = new Administrador(nome, endereco, telefone, codigoSetor, salarioBase, imposto, ajudaDeCusto);
        return a;
    }

    private static Operario cadastrarOperario() {
        scan.nextLine();
        System.out.println("Digite o nome do Operario");
        String nome = scan.nextLine();
        System.out.println("Digite o endereco do Operario");
        String endereco = scan.nextLine();
        System.out.println("Digite o telefone da Operario");
        String telefone = scan.nextLine();
        System.out.println("Digite o codigo do setor do Operario");
        int codigoSetor = scan.nextInt();
        System.out.println("Digite o salario base do Operario");
        double salarioBase = scan.nextDouble();
        System.out.println("Digite o imposto do Operario");
        double imposto = scan.nextDouble();
        System.out.println("Digite o valor de producao do Operario");
        double valorProducao = scan.nextDouble();
        System.out.println("Digite a comissao do Operario");
        double comissao = scan.nextDouble();
        Operario o = new Operario(nome, endereco, telefone, codigoSetor, salarioBase, imposto, valorProducao, comissao);
        return o;
    }

    private static Empregado cadastrarEmpregado() {
        scan.nextLine();
        System.out.println("Digite o nome do Empregado");
        String nome = scan.nextLine();
        System.out.println("Digite o endereco do Empregado");
        String endereco = scan.nextLine();
        System.out.println("Digite o telefone da Empregado");
        String telefone = scan.nextLine();
        System.out.println("Digite o codigo do setor do Empregado");
        int codigoSetor = scan.nextInt();
        System.out.println("Digite o salario base do Empregado");
        double salarioBase = scan.nextDouble();
        System.out.println("Digite o imposto do Empregado");
        double imposto = scan.nextDouble();
        Empregado e = new Empregado(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        return e;
    }

    private static Fornecedor cadastrarFornecedor() {
        scan.nextLine();
        System.out.println("Digite o nome do Fornecedor");
        String nome = scan.nextLine();
        System.out.println("Digite o endereco do Fornecedor");
        String endereco = scan.nextLine();
        System.out.println("Digite o telefone da pessoa");
        String telefone = scan.nextLine();
        System.out.println("Digite o valor do crédito do fornecedor");
        double valorCredito = scan.nextDouble();
        System.out.println("Digite o valor da divida do fornecedor");
        double valorDivida = scan.nextDouble();

        Fornecedor f = new Fornecedor(nome, endereco, telefone, valorCredito, valorDivida);
        return f;
    }

    private static Pessoa cadastrarPessoa() {
        scan.nextLine();
        System.out.println("Digite o nome da pessoa");
        String nome = scan.nextLine();
        System.out.println("Digite o endereco da pessoa");
        String endereco = scan.nextLine();
        System.out.println("Digite o telefone da pessoa");
        String telefone = scan.nextLine();
        Pessoa p = new Pessoa(nome, endereco, telefone);

        return p;
    }
}
