public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador() {
        super();
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
            double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Ajuda de Custo: R$ " + ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
        // return super.getSalarioBase() - super.getSalarioBase() * super.getImposto() /
        // 100 + ajudaDeCusto;
    }

}
