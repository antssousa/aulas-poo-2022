public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa() {

    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "Endereco: " + endereco + "\n" + "Telefone: "
                + telefone;
    }

    public double calcularSalario() {
        return 0.0;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) obj;
        if (!(this.nome.equals(other.getNome()))) {
            return false;
        }
        if (!(this.endereco.equals(other.getEndereco()))) {
            return false;
        }
        if (!(this.telefone.equals(other.getTelefone()))) {
            return false;
        }
        return true;
    }
}
