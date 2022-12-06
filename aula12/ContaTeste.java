
public class ContaTeste {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.deposita(100);
        c.setLimite(100);
        try {
            c.saca(1000);
        } catch (ContaException e) {
            System.out.println(e.getMessage());
        }
    }

}
