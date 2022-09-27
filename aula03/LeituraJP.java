import javax.swing.JOptionPane;

public class LeituraJP {
  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
    JOptionPane.showMessageDialog(null, "Oi, " + nome);
  }
}
