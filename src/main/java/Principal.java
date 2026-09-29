
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int ap, aa, idade;
        ap = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
        aa = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano presente: "));

        if (ap < aa) {
            idade = aa - ap;
            System.out.println("Você tem " + idade + " anos.");
        } else {
            System.out.println("Mentira!");
        }
    }
}
