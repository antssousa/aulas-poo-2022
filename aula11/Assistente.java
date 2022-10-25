public class Assistente extends Funcionario {

    public Assistente(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    public Assistente() {
    }

    public double calcularSalario() {
        return getSalarioBase();
    }
}
