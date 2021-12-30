package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Variable2 extends JFrame implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3,b4;
    JLabel l1,l2;
	 Font JLabel = new Font("Times New Roman",Font.BOLD,28);
    Font f = new Font("Comic Sans MS",Font.BOLD,16);
    Font f4 = new Font("Comic Sans MS",Font.BOLD,24);
    Variable2(){
    f1 = new JFrame("Selection");
    b1 = new JButton("2 Variable");
    b2 = new JButton("3 Variable");
    b3 = new JButton("4 Variable");
    b4 = new JButton("Back");
    l1 = new JLabel("Select any one type of K-MAP");
	
	
	ImageIcon kp = new ImageIcon("D:oop\\OOP_Project\\src\\PROJECT\\g1.gif");
	l2= new JLabel(kp);

    f1.setBounds(0,0,2000,1000);
    f1.setResizable(false);
    b1.setBounds(650,320,260,110);
    b2.setBounds(950,320,260,110);
    b3.setBounds(840,500,260,110);
    b4.setBounds(1550,860,130,60);
    l1.setBounds(100,202,400,100);
   
    b1.setBackground(Color.RED);
    b1.setForeground(Color.BLACK);
    b1.setFont(f4);
    b2.setBackground(Color.RED);
    b2.setForeground(Color.BLACK);
    b2.setFont(f4);
    b3.setBackground(Color.RED);
    b3.setForeground(Color.BLACK);
    b3.setFont(f4);
    b4.setBackground(Color.RED);
    b4.setForeground(Color.BLACK);
    b4.setFont(f);
    f1.setLayout(null);
    f1.add(b1);
    f1.add(b2);
    f1.add(b3);
    f1.add(b4);
    f1.add(l1);
	f1.add(l2);
    f1.setVisible(true);


    b1.addActionListener(this);
    b2.addActionListener(this);
	b3.addActionListener(this);
    b4.addActionListener(this);

    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Variable2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            f1.dispose();
            K2 a = new K2();
        }
        if(e.getSource() == b4){
            f1.dispose();
            new FirstPage();
        }
		if(e.getSource() == b2){
            f1.dispose();
            new K3();
        }
		if(e.getSource() == b3){
            f1.dispose();
            new K4();
        }
		

    }
}
