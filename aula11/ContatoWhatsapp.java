public class ContatoWhatsapp extends Contato {

    public ContatoWhatsapp(String nome, String fone, String cpf) {
        super(nome, fone, cpf);
    }

    public ContatoWhatsapp() {
    }

    @Override
    public String consultaTipo() {
        return "WhatsApp";
    }

}
