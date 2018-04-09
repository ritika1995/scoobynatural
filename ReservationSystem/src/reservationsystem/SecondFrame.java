/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservationsystem;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

//class RadioButtonExample extends JFrame implements ActionListener {    
//JRadioButton rb1,rb2;    
//JButton b;    
//RadioButtonExample(){      
//rb1=new JRadioButton("Male");    
//rb1.setBounds(100,50,100,30);      
//rb2=new JRadioButton("Female");    
//rb2.setBounds(100,100,100,30);    
//ButtonGroup bg=new ButtonGroup();    
//bg.add(rb1);bg.add(rb2);    
//b=new JButton("click");    
//b.setBounds(100,150,80,30);    
//b.addActionListener(this);    
//add(rb1);add(rb2);add(b);    
//setSize(300,300);    
//setLayout(null);    
//setVisible(true);    
//}    
//public void actionPerformed(ActionEvent e){    
//if(rb1.isSelected()){    
//JOptionPane.showMessageDialog(this,"You are Male.");    
//}    
//if(rb2.isSelected()){    
//JOptionPane.showMessageDialog(this,"You are Female.");    
//}    
//}    

class SecondPanel extends JPanel implements ActionListener {
    JRadioButton rb1,rb2;
    public SecondPanel(){
        JLabel label = new JLabel("Choose a Type: ", SwingConstants.CENTER);
        add(label);
        setSize(600, 600);
        rb1=new JRadioButton("1) Smoking");    
        rb1.setBounds(200,150,100,30);      
        rb2=new JRadioButton("2) Non-Smoking");    
        rb2.setBounds(200,200,100,30);    
        ButtonGroup bg=new ButtonGroup();    
        bg.add(rb1);bg.add(rb2);  
        JButton b=new JButton("Proceed");    
        b.setBounds(200,250,80,30);
        b.addActionListener(this);
        add(rb1);add(rb2);add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(rb1.isSelected()){
            System.exit(0);
        }    
        if(rb2.isSelected()){    
            System.exit(0);
    }
 }
}
public class SecondFrame extends JFrame {
    private SecondPanel secondPanel;
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
        
    }
    
}
