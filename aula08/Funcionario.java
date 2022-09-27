public class Funcionario {
    private int mat;
    private String nome;
    private String funcao;
    private double salario;

    public Funcionario() {

    }

    public Funcionario(int mat, String nome, String funcao, double salario) {
        this.mat = mat;
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Matricula: " + mat + "\nNome: " + nome + "\nFuncao: " + funcao +
                "\nSalario: " + salario;
    }

}
