public class Aniversario extends CartaoWeb {

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    public Aniversario() {
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz aniversario " + getDestinatario());
    }

}
