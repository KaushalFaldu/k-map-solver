package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class K2 extends JFrame implements ActionListener {
    JFrame f2;
    JButton b1,b2,b3;
    JLabel l1,l2;
    static  JTextField  t5, t6, t7, t8, t9;
    Font f = new Font("f",Font.BOLD,28);
    Font f1 = new Font("f1",Font.BOLD,14);
    K2() {
        f2 = new JFrame("2 Variable K-MAP");
        b1 = new JButton("Back");
        b2 = new JButton("Reset");
        b3 = new JButton("Enter");
        l1 = new JLabel("F(A,B) = ");
     
        t5 = new







		JTextField("");
        t6 = new JTextField("");
        t7 = new JTextField("");
        t8 = new JTextField("");
        t9 = new JTextField("");

        b1.setFont(f1);
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.BLUE);
        b2.setFont(f1);
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.BLUE);
        b3.setFont(f1);
        b3.setForeground(Color.BLACK);
        b3.setBackground(Color.BLUE);
   
        t5.setFont(f);
        t5.setForeground(Color.BLACK);
        t5.setBackground(Color.BLUE);
        t6.setFont(f);
        t6.setForeground(Color.BLACK);
        t6.setBackground(Color.BLUE);
        t7.setFont(f);
        t7.setForeground(Color.BLACK);
        t7.setBackground(Color.BLUE);
        t8.setFont(f);
        t8.setForeground(Color.BLACK);
        t8.setBackground(Color.BLUE);
        t9.setFont(f);
        t9.setForeground(Color.BLACK);
        t9.setBackground(Color.BLUE);


       
        f2.setBounds(0,0,2000, 1000);
        f2.setResizable(false);
        b1.setBounds(940,700,80, 50);
        b2.setBounds(1050,700,80, 50);
        b3.setBounds(1160,700,80, 50);

        t5.setBounds(1060,410,330,80);
        t6.setBounds(670,500,60,60);
        t7.setBounds(780,500,60,60);
        t8.setBounds(670,590,60,60);
        t9.setBounds(780,590,60,60);
        l1.setBounds(50,60,170, 70);
       
      
       
        ImageIcon manu = new ImageIcon("D:/OOP_Project/src/PROJECT/C2.jpeg");
		
        l1 = new JLabel(manu);
		
       
		
        f2.add(t5);
        f2.add(t6);
        f2.add(t7);
        f2.add(t8);
        f2.add(t9);
        f2.add(b1);
        f2.add(b2);
        f2.add(b3);
        f2.add(l1);
        //f2.add(l2);
        f2.setVisible(true);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new K2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1){
            f2.dispose();
            new Variable2();
        }
		if(e.getActionCommand().equals("Reset")){
			//Create Object
			//toString() method will called
			
			//System.out.println("b1 pressed"); // information code run or not
			
			
			K2.t6.setText("");
			K2.t7.setText("");
			K2.t8.setText("");
			K2.t9.setText("");
			K2.t5.setText("");
		}
		
		
		if(e.getActionCommand().equals("Enter")){
			//System.exit(0);
			//System.out.println("b2 pressed");//information code or not
			
			String a1=K2.t6.getText();
			String b1=K2.t7.getText();
			String c1=K2.t8.getText();
			String d1=K2.t9.getText();
			/*
			a1 = a1.trim();
			b1 = b1.trim();
			c1 = c1.trim();
			d1 = d1.trim();
			*/
			
			System.out.println("a="+a1);
			System.out.println("b="+b1);
			System.out.println("c="+c1);
			System.out.println("d="+d1);
			
       	if(a1.equals("")||b1.equals("")||c1.equals("")||d1.equals("")){
				System.out.println(" please Enter All the values ");
			}
			else{
				//System.out.println("THANK YOU");//information code work or not
				try
				{
					int a = Integer.parseInt(a1);
					int b = Integer.parseInt(b1);
					int c = Integer.parseInt(c1);
					int d = Integer.parseInt(d1);
					 if(a ==1 && b ==0 && c == 0 && d == 0)
            {
                K2.t5.setText("A'B'");
            }

            else if(a == 0 && b ==1 && c ==0 && d==0)
            {
                 K2.t5.setText("A'B");
            }

            else if(a == 0 && b ==0 && c ==1 && d==0)
            {
                 K2.t5.setText("AB'");
            }

            else if(a == 0 && b ==0 && c ==0 && d==1)
            {
                K2.t5.setText("AB");
            }
            else if(a == 1 && b ==1 && c ==1 && d==1)
            {
                 K2.t5.setText("  1  ");
            }

            else if(a == 0 && b ==0 && c ==0 && d==0)
            {
                 K2.t5.setText("  0  ");
            }
            else if(a == 1 && b ==1 && c ==0 && d==0)
            {
                K2.t5.setText("A'");
            }
            else if(a == 0 && b ==0 && c ==1 && d==1)
            {
                 K2.t5.setText("A");
            }

            else if(a == 0 && b ==1 && c ==0 && d==1)
            {
                 K2.t5.setText("B");
            }

            else if(a == 1 && b ==0 && c ==1 && d==0)
            {
                K2.t5.setText("B'");
            }
            else if(a==1 && b==0 && c==1 && d==1)
            {
                K2.t5.setText("A+B'");
            }

            else if(a==0 && b==1 && c==1 && d==1)
            {
                 K2.t5.setText("A+B");
            }

            else if(a==1 && b==1 && c==0 && d==1)
            {
                 K2.t5.setText("A'+B");
            }

            else if(a==1 && b==1 && c==1 && d==0)
            {
                K2.t5.setText("A'+B'");
            }
            else if(a==1 && b==0 && c==0 && d==1)
            {
                 K2.t5.setText("A'B'+AB");
            }

            else if(a==0 && b==1 && c==1 && d==0)
            {
                 K2.t5.setText("A'B+AB'");
            }
					
				
			}
				catch(Exception f)
				{
					System.out.println(" Enter values ( 1 or 0 )");
				}
			}	
		
		}
	}

	
}