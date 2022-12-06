public class Oficio extends DocumentoProcesso {

    private int precedencia;

    public Oficio(String docNumero, int classificacao, int precedencia) {
        super(docNumero, classificacao);
        this.precedencia = precedencia;
    }

    public int getPrecedencia() {
        return precedencia;
    }

    public void setPrecedencia(int precedencia) {
        this.precedencia = precedencia;
    }

    @Override
    public int promove() {
        return precedencia + 1;
    }

}