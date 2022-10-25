/**
 * Nerd
 */
public class Nerd {
    private String nome;
    private String classe;
    private int nivel;
    private int qi;

    public Nerd(String nome, String classe, int nivel, int qi) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.qi = qi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getQi() {
        return qi;
    }

    public void setQi(int qi) {
        this.qi = qi;
    }

    @Override
    public String toString() {
        return "Nerd [nome=" + nome + ", classe=" + classe + ", nivel=" + nivel + ", qi=" + qi + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((classe == null) ? 0 : classe.hashCode());
        result = prime * result + nivel;
        result = prime * result + qi;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Nerd other = (Nerd) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (classe == null) {
            if (other.classe != null)
                return false;
        } else if (!classe.equals(other.classe))
            return false;
        if (nivel != other.nivel)
            return false;
        if (qi != other.qi)
            return false;
        return true;
    }

}