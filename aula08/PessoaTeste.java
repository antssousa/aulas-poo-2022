public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        // p1.nome = "Antonio"; x não pode, não faça isso, não pode 😭
        p1.setNome("Antonio");
        // p1.sobrenome = "Sousa";
        p1.setSobrenome("Sousa");
        Pessoa p2 = new Pessoa("Pedro", "Ferreira");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Sobrenome: " + p2.getSobrenome());
        System.out.println(p1);
        System.out.println(p1.toString());
        System.out.println(p2);

    }
}
