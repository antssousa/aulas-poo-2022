public class ContaTeste {
    public static void main(String[] args) {
        Conta c1 = new Conta("Joao", 123, 10000);
        Conta c2 = new Conta("Pedro", 124, 10000);
        Conta c3 = new Conta("Fernanda", 125, 10000);
        Conta c4 = new Conta("Eduarda", 126, 10000);
        Conta c5 = new Conta("Lois", 127, 10000);
        Conta c6 = new Conta("Satan", 616, 10000);
        Conta c7 = new Conta("Ryan", 129, 10000);

        System.out.println("O total de contas é " + Conta.getTotalDeContas());
    }
}
