/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservationsystem;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
/**
 * @author RSharma
 * @author DSharma
 */

class SecondPanel extends JPanel implements ActionListener {
    JRadioButton rb1,rb2;
    public SecondPanel(){
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        JLabel label = new JLabel("Choose a Type: ", SwingConstants.CENTER);
        add(label);
        setSize(600, 600);
        rb1=new JRadioButton("1) Smoking");    
        rb1.setBounds(200,150,100,30);      
        rb2=new JRadioButton("2) Non-Smoking");    
        rb2.setBounds(200,200,100,30);    
        ButtonGroup bg=new ButtonGroup();    
        bg.add(rb1);bg.add(rb2);  
        JButton proceed = new JButton("Proceed");    
        proceed.setBounds(200,250,80,30);
        proceed.addActionListener(this);
        add(rb1);add(rb2);add(proceed);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(rb1.isSelected()){
            
        }    
        if(rb2.isSelected()){    
          repaint();
    }
 }
}
class ThirdPanel extends JPanel {
        public ThirdPanel(){
            setLayout(new GridLayout(2,5));
            JButton b1=new JButton("1");
            b1.setBounds(100,50,20,20);
            JButton b2=new JButton("2");  
            JButton b3=new JButton("3");  
            JButton b4=new JButton("4");  
            JButton b5=new JButton("5");  
            JButton b6=new JButton("6");  
            JButton b7=new JButton("7");  
            JButton b8=new JButton("8");  
            JButton b9=new JButton("9");
            JButton b10=new JButton("10");
            add(b1);add(b2);
            add(b3);add(b4);
            add(b5);add(b6);
            add(b7);add(b8);
            add(b9);add(b10);
        }
}

public class SecondFrame extends JFrame {
     SecondPanel secondPanel;
     ThirdPanel thirdPanel;
    public SecondFrame() {
        setVisible(true);
        setTitle("Winchester Airlines Booking Portal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        Toolkit tool = getToolkit();
        Dimension s = tool.getScreenSize();
        setLocation(s.width/2 - getWidth()/2,s.height/2 - getHeight()/2);
        secondPanel = new SecondPanel();
        add(secondPanel);
        thirdPanel = new ThirdPanel();
        //add(thirdPanel);
        
    }
    
}
