public class Gerente extends Funcionario {

    public Gerente(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    public Gerente() {
    }

    @Override
    public double calcularSalario() {
        return 2 * getSalarioBase();
    }
    // 2 x salarioBase

}
