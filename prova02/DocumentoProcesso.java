public class DocumentoProcesso extends Object {

    private String docNumero;

    private int classificacao;

    public DocumentoProcesso(String docNumero, int classificacao) {

        if (classificacao < 1)
            throw new IllegalArgumentException("A classificação do documento deve ser no mínimo 1.");

        this.docNumero = docNumero;
        this.classificacao = classificacao;
    }

    public String getDocNumero() {
        return docNumero;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setDocNumero(String docNumero) {
        this.docNumero = docNumero;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int promove() {
        return classificacao + 1;
    }

}
