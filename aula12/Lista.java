public class Lista {
    private int[] valores;

    public Lista() {
        valores = new int[5];
    }

    public Lista(int tamanho) {
        valores = new int[tamanho];
    }

    public void insere(int pos, int valor) throws ListaException {
        valores[pos] = valor;
    }

    public void insere(int pos, int valor, int valor2) throws ListaException {
        valores[pos] = valor / valor2;
    }

    public void printValores() {
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }

        System.out.println("");
    }

}
