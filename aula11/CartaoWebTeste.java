public class CartaoWebTeste {
    public static void main(String[] args) {
        CartaoWeb[] cartoes = new CartaoWeb[3];

        cartoes[0] = new DiaDosNamorados("Gaby");
        cartoes[1] = new Natal("Deborah");
        cartoes[2] = new Aniversario("Fernanda");

        for (CartaoWeb cartao : cartoes) {
            cartao.showMessage();
        }
    }
}
