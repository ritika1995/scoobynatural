package reservationsystem;
import javax.swing.SwingUtilities;
/**
 * @author RSharma
 * @author DSharma
 */
public class App {
    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable(){ // to run the swing app on EDT
           @Override
           public void run(){
              MainFrame obj =  new MainFrame();
                          }
       });
    }
}
