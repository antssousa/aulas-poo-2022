public class Conta {
    private String titular;
    private int numero;
    private double saldo;

    private static int totalDeContas;

    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        Conta.totalDeContas = Conta.totalDeContas + 1; // Conta.totalDeContas++; Conta.totalDeContas += 1
    }

    public Conta() {
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        return "Titular: " + titular + "\nNumero: " + numero + "\nSaldo: R$ " + saldo;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

}
