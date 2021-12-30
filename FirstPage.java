 package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FirstPage implements ActionListener {
    JButton B1,B2;
    JFrame f1;
    JLabel l;
    public FirstPage(){
        f1 = new JFrame("WELCOME TO PROJECT");
        B1 = new JButton("ENTER");
        B2 = new JButton("EXIT");
        B1.setBounds(400,740,208,65);
      
        B2.setBounds(1316,740,220,67);
        ImageIcon manu = new ImageIcon("D:/OOP_Project/src/PROJECT/4c.jpeg");
        l= new JLabel(manu);

        B1.addActionListener(this);
        B2.addActionListener(this);

        f1.add(B1);
        f1.add(B2);
        f1.add(l);
        f1.setSize(2000,1000);
        f1.setResizable(false);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
       
        new FirstPage();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == B1){
            f1.dispose();
            Variable2 v = new Variable2();
            

        }
        if(e.getSource() == B2){
            f1.setVisible(false);
        }
    }
}

