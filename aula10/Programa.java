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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    for (int i = 0; i < contPessoas; i++) {
                        System.out.println("--------------------");
                        System.out.println(pessoas[i]);
                    }
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }
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
