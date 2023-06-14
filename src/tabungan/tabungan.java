
package tabungan;
import form.login;
import javax.swing.SwingUtilities;

public class tabungan {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    
}
