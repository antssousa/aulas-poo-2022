import java.util.List;
import java.util.Scanner;

public class ContatoTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContatoListDAO agenda = new ContatoListDAO();
        agenda.insere(new ContatoWhatsapp("Jeovana Souza", "999999999", "111"));
        agenda.insere(new ContatoWhatsapp("Eduardo Santos", "999999999", "133"));
        agenda.insere(new ContatoWhatsapp("Fernanda Farias", "999999999", "133"));
        for (;;) {
            System.out.println("Menu");
            System.out.println("1 - Inserir um contato");
            System.out.println("2 - Atualizar um contato");
            System.out.println("3 - Excluir um contato");
            System.out.println("4 - Listar todos os contatos");
            System.out.println("5 - Buscar por nome");
            System.out.println("0 - Sair");
            int op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1:
                    Contato c = new ContatoWhatsapp();
                    System.out.println("Digite o nome do contato");
                    c.setNome(scan.nextLine());
                    System.out.println("Digite o telefone do contato");
                    c.setFone(scan.nextLine());
                    System.out.println("Digite o cpf do contato");
                    c.setCpf(scan.nextLine());
                    agenda.insere(c);
                    break;
                case 2:
                    Contato atualiza = new ContatoWhatsapp();
                    System.out.println("Digite os dados do contato a ser atualizado");
                    System.out.println("Digite o cpf do contato a ser atualizado");
                    atualiza.setCpf(scan.nextLine());
                    System.out.println("Digite o nome do contato a ser atualizado");
                    atualiza.setNome(scan.nextLine());
                    System.out.println("Digite o telefone do contato a ser atualizado");
                    atualiza.setFone(scan.nextLine());
                    agenda.atualiza(atualiza);
                    break;
                case 3:

                    System.out.println("Excluindo o contato");
                    System.out.println("Digite o cpf do contato a ser excluido");
                    agenda.exclui(scan.nextLine());
                    break;
                case 4:
                    System.out.println("--------------------------------");
                    System.out.println("Listando todos os contatos");

                    List<Contato> lista = agenda.busca();
                    for (Contato contato : lista) {
                        System.out.println(contato);
                        ;
                    }
                    break;
                case 5:
                    System.out.println("--------------------------------");
                    System.out.println("Listando todos os contatos por nome");
                    System.out.println("Digite o nome do contato");
                    String nome = scan.nextLine();
                    List<Contato> nomes = agenda.buscaPorNome(nome);
                    for (Contato contato : nomes) {
                        System.out.println(contato);
                        ;
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao invalida");
            }

        }
    }
}
