public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setMat(123);
        f1.setNome("Joao");
        f1.setFuncao("Professor");
        f1.setSalario(12354.45);
        System.out.println("O salario do " + f1.getNome() + " e R$ " + f1.getSalario());
        System.out.println("--------------");
        System.out.println(f1); // f1.toString()
        System.out.println("--------------");
        System.out.println(f1.toString());
        
    }
}
