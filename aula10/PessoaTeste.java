
public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joa0zinho", "Rua A, Casa 2", "55(86)98563-1234");
        Pessoa p2 = new Pessoa("Pedrinho", "Rua A, Casa 3", "55(86)98563-4321");
        Pessoa p3 = new Pessoa("Lukinha da Galera", "Rua B, Casa 3", "55(86)99999-4321");
        Pessoa p4 = new Pessoa("Lukinha da Galera", "Rua B, Casa 3", "55(86)99999-4321");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p1.getClass());
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(p3.equals(p4));
        Fornecedor f1 = new Fornecedor("Feh", "Rua da priguica", "912345678", 15000, 12000);
        System.out.println(f1 instanceof Pessoa);
        System.out.println(f1 instanceof Object);
        System.out.println(p1 instanceof Fornecedor);
        System.out.println(f1);
    }

}
