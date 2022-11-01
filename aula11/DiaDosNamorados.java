public class DiaDosNamorados extends CartaoWeb {

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    public DiaDosNamorados() {
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz dia dos namorados " + getDestinatario());
    }

}
