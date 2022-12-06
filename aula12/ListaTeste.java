public class ListaTeste {
    public static void main(String[] args) {
        Lista lista = new Lista(10);
        try {
            lista.insere(5, 2);
            lista.insere(2, 9, 3);
            lista.insere(10, 3);
            lista.insere(4, 4, 0);
        } catch (ListaException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        lista.printValores();
    }
}
