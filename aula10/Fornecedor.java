
public class Fornecedor extends Pessoa {
    private double valorDivida;
    private double valorCredito;

    public Fornecedor() {
        super();
    }

    public Fornecedor(String nome, String endereco, String telefone, double valorDivida, double valorCredito) {
        super(nome, endereco, telefone);
        this.valorDivida = valorDivida;
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Valor da Divida: R$ " + valorDivida + "\n"
                + "Valor do Credito: R$ "
                + valorCredito;
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

}
