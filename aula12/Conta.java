
public class Conta {
    private String nome;
    private double saldo;
    private double limite;

    public Conta() {
    }

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void saca(double valor) throws ContaException {
        if (valor > saldo) {
            throw new ContaException("Saldo insuficiente");
        }
        this.saldo = this.saldo - valor;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta [nome=" + nome + ", saldo=" + saldo + "]";
    }

}
