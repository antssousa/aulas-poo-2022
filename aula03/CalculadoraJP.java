import javax.swing.JOptionPane;

public class CalculadoraJP {
  public static void main(String[] args) {
    String strN1 = JOptionPane.showInputDialog(null, "Digite um número");
    String strN2 = JOptionPane.showInputDialog(null, "Digite outro número");
    double n1 = Double.parseDouble(strN1);
    double n2 = Double.parseDouble(strN2);
    double soma = n1 + n2;
    double sub = n1 - n2;
    double mult = n1 * n2;
    double div = n1 / n2;

    JOptionPane.showMessageDialog(null,
        "Soma: " + soma + "\nSubtracao: " + sub + "\nMultplicacao" + mult + "\nDivisao: " + div);
    // JOptionPane.showMessageDialog(null, "Soma: " + soma);
    // JOptionPane.showMessageDialog(null, "Subtração: " + sub);
    // JOptionPane.showMessageDialog(null, "Multiplicação: " + mult);
    // JOptionPane.showMessageDialog(null, "Divisão: " + div);
  }
}
