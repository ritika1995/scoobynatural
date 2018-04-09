package reservationsystem;
/**
 * @author DSharma
 * @author RSharma
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class FrontPanel extends JPanel {
    public FrontPanel(){
        JLabel label = new JLabel("<html>Welcome <br/><br/>To<br/><br/>Winchester<br/><br/>Airlines</html>", SwingConstants.CENTER);
        label.setFont(label.getFont().deriveFont(50.0f));
        add(label);
    }
}

class MyButton extends JButton {
    public MyButton(){ 
       setText("Book Now!");
        addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               new SecondFrame();
           }
       });
               
    }
}

class MainFrame extends JFrame {
    private FrontPanel entryPanel;
    private MyButton bookNow;
    MainFrame(){
        setVisible(true);
        setLayout(new BorderLayout());
        setTitle("Winchester Airlines Booking Portal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
        entryPanel = new FrontPanel();
        getContentPane().add(entryPanel);
        bookNow = new MyButton();
        add(bookNow, BorderLayout.SOUTH);
    }
}


