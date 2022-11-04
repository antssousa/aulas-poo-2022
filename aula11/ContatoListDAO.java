import java.util.List;
import java.util.ArrayList;

public class ContatoListDAO implements ContatoDAO {

    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public void insere(Contato c) {
        contatos.add(c);
    }

    public void atualiza(Contato c) {
        Contato antigo = busca(c.getCpf());
        if (antigo == null) {
            System.out.println("Contato nao existe");
        } else {
            antigo.setNome(c.getNome());
            antigo.setFone(c.getFone());
        }
    }

    public void exclui(String cpf) {
        Contato remover = busca(cpf);
        if (remover == null) {
            System.out.println("Contato nao existe");
        } else {
            contatos.remove(remover);
        }
    }

    public Contato busca(String cpf) {
        for (Contato c : contatos) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    public List<Contato> busca() {
        return contatos;

    }

    public List<Contato> buscaPorNome(String nome) {
        ArrayList<Contato> nomes = new ArrayList<Contato>();

        for (Contato c : contatos) {
            if (c.getNome().equals(nome)) {
                nomes.add(c);
            }
        }

        return nomes;
    }

}
