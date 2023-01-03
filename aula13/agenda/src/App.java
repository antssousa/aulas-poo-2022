import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContatoDAO dao = new ContatoDAO();
        Contato c;
        long id;
        String nome;
        String endereco;
        String telefone;
        String email;
        try {
            Connection con = dao.getConnection();
            System.out.println("Conectado");
            String sql = "select * from contatos";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                c = new Contato();
                c.setId(rs.getLong("id"));
                c.setNome(rs.getString("nome"));
                c.setTelefone(rs.getString("telefone"));
                c.setEndereco(rs.getString("endereco"));
                c.setEmail(rs.getString("email"));
                System.out.println(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (;;) {
            System.out.println("Menu");
            System.out.println("1 - Inserir um contato na agenda");
            System.out.println("2 - Selecionar um contato pelo id");
            System.out.println("3 - Listar todos os contatos");
            System.out.println("4 - Atualizar dados dos contato");
            System.out.println("5 - Apagar um contato");
            System.out.println("0 - Sair");
            System.out.print("Iai? Qual e> ");
            int op = scan.nextInt();
            switch (op) {
                case 0:
                    System.out.println("Ssssaaaaaaiiiiiinnnnndddddooooo....");
                    System.exit(0);
                    break;
                case 1:
                    scan.nextLine();
                    System.out.println("Cadastro do contato");
                    System.out.println("Digite o nome do contato");
                    nome = scan.nextLine();
                    System.out.println("Digite o telefone do contato");
                    telefone = scan.nextLine();
                    System.out.println("Digite o endereco do contato");
                    endereco = scan.nextLine();
                    System.out.println("Digite o email do contato");
                    email = scan.nextLine();
                    c = new Contato(nome, telefone, endereco, email);
                    dao.insert(c);
                    break;
                case 2:
                    System.out.println("Pesquisar por ID");
                    System.out.println("Digite o id da pessoa");
                    id = scan.nextLong();
                    c = dao.select(id);
                    if (c != null) {
                        System.out.println("Pessoa encontrada");
                        System.out.println(c);
                    } else {
                        System.out.println("Pessoa nao encontrada");
                    }
                    break;
                case 3:
                    List<Contato> lista = dao.select();
                    if (lista.size() > 0) {
                        System.out.println("Exibindo pessoas cadastradas");
                        for (Contato contato : lista) {
                            System.out.println(contato);
                        }
                    } else {
                        System.out.println("Nao existe pessoas cadastradas");
                    }
                    break;
                case 4:
                    System.out.println("Atualizando dados do contato");
                    System.out.println("Digite o id do contato que deseja atualizar");
                    id = scan.nextLong();
                    c = dao.select(id);
                    if (c != null) {
                        scan.nextLine();
                        System.out.println("Digite o novo nome do contato");
                        nome = scan.nextLine();
                        System.out.println("Digite o novo telefone do contato");
                        telefone = scan.nextLine();
                        System.out.println("Digite o novo endereco do contato");
                        endereco = scan.nextLine();
                        System.out.println("Digite o novo email do contato");
                        email = scan.nextLine();
                        c = new Contato(id, nome, telefone, endereco, email);
                        dao.update(c);
                    } else {
                        System.out.println("O contato nao existe");
                    }

                    break;
                case 5:
                    System.out.println("Apagar pessoa da lista");
                    System.out.println("Digite o id da pessoa que deseja remover");
                    id = scan.nextLong();
                    c = dao.select(id);
                    if (c != null) {
                        System.out.println("Removendo o contato");
                        dao.delete(c);

                    } else {
                        System.out.println("Nao foi possivel remover o contato");
                    }

                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }
    }
}
