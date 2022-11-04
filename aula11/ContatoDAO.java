import java.util.List;

public interface ContatoDAO {

    public void insere(Contato c);

    public void atualiza(Contato c);

    public void exclui(String cpf);

    public Contato busca(String cpf);

    public List<Contato> busca();

    public List<Contato> buscaPorNome(String nome);

}