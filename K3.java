package PROJECT;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class K3 implements ActionListener, KeyListener {
    JFrame f3;
    JButton []b = new JButton[3];
    JLabel l1, l2;
    JTextField []t = new JTextField[17];
    Font f = new Font("M", Font.BOLD, 28);
    Font f1 = new Font("V", Font.BOLD, 14);
    int []a = new int[8];
    String []bName = new String[]{"ENTER","Reset","BACK"};

    public K3() {
        //JFrame
        f3 = new JFrame("3 Variable K-MAP");

       
        ImageIcon manu = new ImageIcon("D:/OOP_Project/src/PROJECT/c3.PNG");
        l2 = new JLabel(manu);

        //JTextField
        //by kaushal faldu
        for(int i=0;i<17;i++){
            t[i] = new JTextField("");
            t[i].setFont(f);
            t[i].setForeground(Color.RED);
            t[i].setBackground(Color.YELLOW);
            t[i].setHorizontalAlignment(JTextField.CENTER);
            t[i].addKeyListener(this);
        }
        for(int i =0,j=245;i<8;i++,j+=65){
            t[i].setBounds(j,70,30,40);
        }
        for(int i=8,j=130;i<12;i++,j+=90){
            t[i].setBounds(j,370,40,50);
        }
        for(int i=12,j=130;i<16;i++,j+=90){
            t[i].setBounds(j,460,40,50);
        }
        t[16].setBounds(590, 280, 290, 100);
        for(int i=0;i<17;i++){
            f3.add(t[i]);
        }

        //JButton
        for(int i=0,j=50;i<3;i++,j+=220){
            b[i] = new JButton(bName[i]);
            b[i].setFont(f);
            b[i].setForeground(Color.blue);
            b[i].setBackground(Color.ORANGE);
            b[i].setBounds(j,610,150,60);
            f3.add(b[i]);
            b[i].addActionListener(this);
        }


        //f3.add(l1);
        f3.add(l2);
        f3.setVisible(true);
        f3.setSize(900, 750);
        f3.setResizable(false);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
    }

    

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b[0]) {
            kMapInsert();
            simplificationKMAP();
        }
        if (e.getSource() == b[1]) {
            for(int i=0;i<17;i++)
                t[i].setText("");
        }
        if (e.getSource() == b[2]) {
            new Variable2();
            f3.dispose();
        }
       
    }

    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {
        for(int i=0;i<8;i++){
            if(e.getSource() == t[i]){
                try{
                    int data = Integer.parseInt(t[i].getText());
                    //System.out.println(keyCode);
                    if(data >7 || t[i].getText().length()>1){
                        t[i].setText("");
                    }
                }catch(NumberFormatException numF){}
            }
        }
    }
    public void kMapInsert(){
        for(int i=0;i<8;i++){
            if(!t[i].getText().isEmpty()){
                a[i] = Integer.parseInt(t[i].getText());
            }
            else a[i] = -1;
        }
        int flag =0;
        for(int i=0;i<8;i++){
            flag =0;
            for(int j=0;j<8;j++){
                if(a[j]==i){
                    t[i+8].setText("");
                    t[i+8].setText("1");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                t[i+8].setText("");
                t[i+8].setText("0");
            }

        }
        String str = t[10].getText();
        t[10].setText(t[11].getText());
        t[11].setText(str);
        str = t[14].getText();
        t[14].setText(t[15].getText());
        t[15].setText(str);
    }
    public void simplificationKMAP(){
        String tempVar = "";
        String finalvar="";
        for(int i=8;i<16;i++){
            tempVar +=t[i].getText();
        }
        if(tempVar.equals("00000000"))finalvar = "0";else if(tempVar.equals("00000001"))finalvar ="ABC'";
        else if(tempVar.equals("00000010"))finalvar = "ABC";else if(tempVar.equals("00000011"))finalvar ="AB'";
        else if(tempVar.equals("00000100"))finalvar = "AB'C";else if(tempVar.equals("00000101"))finalvar ="AB'C + ABC'";
        //by kaushal faldu
        else if(tempVar.equals("00000110"))finalvar = "AC";else if(tempVar.equals("00000111"))finalvar ="AC + AB";
        else if(tempVar.equals("00001000"))finalvar = "AB'C'";else if(tempVar.equals("00001001"))finalvar ="AC'";
        //by kaushal faldu
        else if(tempVar.equals("00001010"))finalvar = "AB'C' + ABC";else if(tempVar.equals("00001011"))finalvar ="AC' + AB";
        else if(tempVar.equals("00001100"))finalvar = "AB'";else if(tempVar.equals("00001101"))finalvar ="AB' + AC'";
        else if(tempVar.equals("00001110"))finalvar = "AB' + AC";else if(tempVar.equals("00001111"))finalvar ="A";
        else if(tempVar.equals("00010000"))finalvar = "A'BC'";else if(tempVar.equals("00010001"))finalvar ="BC'";
        else if(tempVar.equals("00010010"))finalvar = "A'BC' + ABC";else if(tempVar.equals("00010011"))finalvar ="AB + BC'";
        else if(tempVar.equals("00010100"))finalvar = "A'BC' + AB'C";else if(tempVar.equals("00010101"))finalvar ="AB'C + BC'";
        else if(tempVar.equals("00010110"))finalvar = "AC + BC'";else if(tempVar.equals("00010111"))finalvar ="AC + BC'";
        else if(tempVar.equals("00011000"))finalvar = "A'BC' + AB'C'";else if(tempVar.equals("00011001"))finalvar ="BC' + AC'";
        else if(tempVar.equals("00011010"))finalvar = "A'BC' + AB'C' + ABC";else if(tempVar.equals("00011011"))finalvar ="BC' +AB + AC'";
        else if(tempVar.equals("00011100"))finalvar = "A'BC' + AB'";else if(tempVar.equals("00011101"))finalvar ="AB' + BC'";
        else if(tempVar.equals("00011110"))finalvar = "A'BC' + AB' + AC";else if(tempVar.equals("00011111"))finalvar ="A + BC'";
        else if(tempVar.equals("00100000"))finalvar = "A'BC";else if(tempVar.equals("00100001"))finalvar ="A'BC + ABC'";
        else if(tempVar.equals("00100010"))finalvar = "BC";else if(tempVar.equals("00100011"))finalvar ="BC + AB";
        else if(tempVar.equals("00100100"))finalvar = "A'BC + AB'C";else if(tempVar.equals("00100101"))finalvar ="A'BC + AB'C + ABC'";
        else if(tempVar.equals("00100110"))finalvar = "AC + BC";else if(tempVar.equals("00100111"))finalvar ="AB + BC + AC";
        else if(tempVar.equals("00101000"))finalvar = "A'BC + AB'C'";else if(tempVar.equals("00101001"))finalvar ="A'BC + AC'";
        else if(tempVar.equals("00101010"))finalvar = "BC + AB'C'";else if(tempVar.equals("00101011"))finalvar ="BC + AC'";
        else if(tempVar.equals("00101100"))finalvar = "A'BC + AB'";else if(tempVar.equals("00101101"))finalvar ="A'BC + AB' + AC'";
        else if(tempVar.equals("00101110"))finalvar = "AB' + BC";else if(tempVar.equals("00101111"))finalvar ="A + BC";
        //by kaushal faldu
        else if(tempVar.equals("00110000"))finalvar = "A'B";else if(tempVar.equals("00110001"))finalvar ="A'B + BC'";
        else if(tempVar.equals("00110010"))finalvar = "A'B + BC";else if(tempVar.equals("00110011"))finalvar ="B";
        else if(tempVar.equals("00110100"))finalvar = "AB'C + A'B";else if(tempVar.equals("00110101"))finalvar ="A'B + BC' + AB'C";
        else if(tempVar.equals("00110110"))finalvar = "A'B + AC";else if(tempVar.equals("00110111"))finalvar ="A'B + AC + AB";
        else if(tempVar.equals("00111000"))finalvar = "A'B + AB'C'";else if(tempVar.equals("00111001"))finalvar ="A'B + AC'";
        else if(tempVar.equals("00111010"))finalvar = "A'B + BC + AB'C'";else if(tempVar.equals("00111011"))finalvar ="B + AC'";
        else if(tempVar.equals("00111100"))finalvar = "A'B + AB'";else if(tempVar.equals("00111101"))finalvar ="A'B + AB' + AC'";
        else if(tempVar.equals("00111110"))finalvar = "A'B + AB' + AC";else if(tempVar.equals("00111111"))finalvar ="A + B";
        else if(tempVar.equals("01000000"))finalvar = "A'B'C";else if(tempVar.equals("01000001"))finalvar ="A'B'C + ABC'";//by kaushal faldu
        else if(tempVar.equals("01000010"))finalvar = "A'B'C + ABC";else if(tempVar.equals("01000011"))finalvar ="AB + A'B'C";
        else if(tempVar.equals("01000100"))finalvar = "B'C";else if(tempVar.equals("01000101"))finalvar ="B'C + ABC'";
        else if(tempVar.equals("01000110"))finalvar = "B'C + AC";else if(tempVar.equals("01000111"))finalvar ="B'C + AB";
        else if(tempVar.equals("01001000"))finalvar = "A'B'C + AB'C'";else if(tempVar.equals("01001001"))finalvar ="A'B'C + AC'";
        else if(tempVar.equals("01001010"))finalvar = "A'B'C + AB'C' + ABC";else if(tempVar.equals("01001011"))finalvar ="A'B'C + AC' + AB";
        else if(tempVar.equals("01001100"))finalvar = "AB' + B'C";else if(tempVar.equals("01001101"))finalvar ="AB' + AC' + B'C";
        else if(tempVar.equals("01001110"))finalvar = "AB' + AC + B'C";else if(tempVar.equals("01001111"))finalvar ="A + B'C";
        else if(tempVar.equals("01010000"))finalvar = "A'B'C + A'BC'";else if(tempVar.equals("01010001"))finalvar ="A'B'C + BC'";
        else if(tempVar.equals("01010010"))finalvar = "A'B'C + ABC + A'BC'";else if(tempVar.equals("01010011"))finalvar ="A'B'C + AB + BC'";
        else if(tempVar.equals("01010100"))finalvar = "A'BC' + B'C";else if(tempVar.equals("01010101"))finalvar ="B'C + BC'";
        else if(tempVar.equals("01010110"))finalvar = "A'BC' + AC + B'C";else if(tempVar.equals("01010111"))finalvar ="AB + B'C + BC'";
        else if(tempVar.equals("01011000"))finalvar = "A'B'C + A'BC' + AB'C'";else if(tempVar.equals("01011001"))finalvar ="A'B'C + BC' + AC'";
        else if(tempVar.equals("01011010"))finalvar = "A'B'C + A'BC' + AB'C' + ABC";else if(tempVar.equals("01011011"))finalvar ="A'B'C + AB + AC' + BC' ";
        else if(tempVar.equals("01011100"))finalvar = "A'BC' + AB' + B'C";else if(tempVar.equals("01011101"))finalvar ="AB' + B'C + BC'";
        else if(tempVar.equals("01011110"))finalvar = "A'BC' + AB' + AC + B'C";else if(tempVar.equals("01011111"))finalvar ="A + B'C + BC'";
        else if(tempVar.equals("01100000"))finalvar = "A'C";else if(tempVar.equals("01100001"))finalvar ="A'C + ABC'";//by kaushal faldu
        else if(tempVar.equals("01100010"))finalvar = "A'C + BC";else if(tempVar.equals("01100011"))finalvar ="A'C + AB";
        else if(tempVar.equals("01100100"))finalvar = "A'C + B'C";else if(tempVar.equals("01100101"))finalvar ="A'C + B'C + ABC'";
        else if(tempVar.equals("01100110"))finalvar = "C";else if(tempVar.equals("01100111"))finalvar ="C + AB";
        else if(tempVar.equals("01101000"))finalvar = "A'C + AB'C'";else if(tempVar.equals("01101001"))finalvar ="A'C + AC'";
        else if(tempVar.equals("01101010"))finalvar = "A'C + BC + AB'C'";else if(tempVar.equals("01101011"))finalvar ="A'C + AB + AC'";
        else if(tempVar.equals("01101100"))finalvar = "A'C + AB'";else if(tempVar.equals("01101101"))finalvar ="A'C + AB' + AC'";
        else if(tempVar.equals("01101110"))finalvar = "C + AB'C'";else if(tempVar.equals("01101111"))finalvar ="A + C";
        else if(tempVar.equals("01110000"))finalvar = "A'C + A'B";else if(tempVar.equals("01110001"))finalvar ="A'C + BC'";
        else if(tempVar.equals("01110010"))finalvar = "A'C + A'B + BC";else if(tempVar.equals("01110011"))finalvar ="B + A'C";
        else if(tempVar.equals("01110100"))finalvar = "A'B + B'C";else if(tempVar.equals("01110101"))finalvar ="A'B + B'C + BC'";
        else if(tempVar.equals("01110110"))finalvar = "C + A'B";else if(tempVar.equals("01110111"))finalvar ="C + B";
        else if(tempVar.equals("01111000"))finalvar = "A'C + A'B + AB'C'";else if(tempVar.equals("01111001"))finalvar ="A'C + AC' + BC'";
        else if(tempVar.equals("01111010"))finalvar = "A'C + A'B + BC + AB'C'";else if(tempVar.equals("01111011"))finalvar ="B + A'C + AC'";
    else if(tempVar.equals("01111100"))finalvar = "A'C + A'B +AB'";else if(tempVar.equals("01111101"))finalvar ="A'C + A'B + AB' + AC'";
        else if(tempVar.equals("01111110"))finalvar = "C + A'B + AB'";else if(tempVar.equals("01111111"))finalvar ="A + B + A'C";

        else if(tempVar.equals("10000000"))finalvar = "A'B'C'";else if(tempVar.equals("10000001"))finalvar ="A'B'C' + ABC'";
        else if(tempVar.equals("10000010"))finalvar = "A'B'C' + ABC";else if(tempVar.equals("10000011"))finalvar ="AB + A'B'C'";
        else if(tempVar.equals("10000100"))finalvar = "A'B'C' + AB'C";else if(tempVar.equals("10000101"))finalvar ="A'B'C' + AB'C + ABC'";
        else if(tempVar.equals("10000110"))finalvar = "A'B'C' + AC";else if(tempVar.equals("10000111"))finalvar ="AC + AB + A'B'C'";
        else if(tempVar.equals("10001000"))finalvar = "B'C'";else if(tempVar.equals("10001001"))finalvar ="B'C' + AC'";
        else if(tempVar.equals("10001010"))finalvar = "B'C' + ABC";else if(tempVar.equals("10001011"))finalvar ="B'C' + AB";
        else if(tempVar.equals("10001100"))finalvar = "B'C' + AB'";else if(tempVar.equals("10001101"))finalvar ="AB' + AC' + B'C'";
        else if(tempVar.equals("10001110"))finalvar = "AC + B'C'";else if(tempVar.equals("10001111"))finalvar ="A + B'C'";
        else if(tempVar.equals("10010000"))finalvar = "A'C'";else if(tempVar.equals("10010001"))finalvar ="A'C' + ABC'";
        else if(tempVar.equals("10010010"))finalvar = "A'C'+ ABC";else if(tempVar.equals("10010011"))finalvar ="A'C' + AB";
        else if(tempVar.equals("10010100"))finalvar = "A'C' + AB'C";else if(tempVar.equals("10010101"))finalvar ="A'C' + BC' + AB'C";
        else if(tempVar.equals("10010110"))finalvar = "A'C' + AC";else if(tempVar.equals("10010111"))finalvar ="A'C' + AC + AB";
        else if(tempVar.equals("10011000"))finalvar = "A'C' + B'C'";else if(tempVar.equals("10011001"))finalvar ="C'";
        else if(tempVar.equals("10011010"))finalvar = "A'C' + B'C' + ABC";else if(tempVar.equals("10011011"))finalvar ="C' + AB";//by kaushal faldu
        else if(tempVar.equals("10011100"))finalvar = "A'C' + AB'";else if(tempVar.equals("10011101"))finalvar ="C' + AB'";
        else if(tempVar.equals("10011110"))finalvar = "A'C' + AB' + AC";else if(tempVar.equals("10011111"))finalvar ="A + C'";
        else if(tempVar.equals("10100000"))finalvar = "A'B'C' + A'BC";else if(tempVar.equals("10100001"))finalvar ="A'B'C' + A'BC + ABC'";
        else if(tempVar.equals("10100010"))finalvar = "A'B'C' + BC";else if(tempVar.equals("10100011"))finalvar ="AB + BC + A'B'C'";
        else if(tempVar.equals("10100100"))finalvar = "A'B'C' + A'BC + AB'C";else if(tempVar.equals("10100101"))finalvar ="A'B'C' + A'BC + AB'C + ABC'";
        else if(tempVar.equals("10100110"))finalvar = "AC + BC + A'B'C'";else if(tempVar.equals("10100111"))finalvar ="AC + AB + BC + A'B'C'";
        else if(tempVar.equals("10101000"))finalvar = "B'C' + A'BC";else if(tempVar.equals("10101001"))finalvar ="AC' + B'C' + A'BC";
        else if(tempVar.equals("10101010"))finalvar = "B'C' + BC";else if(tempVar.equals("10101011"))finalvar ="B'C' + BC + AC'";
        else if(tempVar.equals("10101100"))finalvar = "AB' + B'C' + A'BC";else if(tempVar.equals("10101101"))finalvar ="AB' + B'C' + AC' + A'BC ";
        else if(tempVar.equals("10101110"))finalvar = "AC + BC + B'C'";else if(tempVar.equals("10101111"))finalvar ="A + B'C' + BC";
        else if(tempVar.equals("10110000"))finalvar = "A'B + A'C'";else if(tempVar.equals("10110001"))finalvar ="A'B + A'C' + BC'";
        else if(tempVar.equals("10110010"))finalvar = "A'C' + BC";else if(tempVar.equals("10110011"))finalvar ="B + A'C'";
        else if(tempVar.equals("10110100"))finalvar = "A'B + A'C' + AB'C";else if(tempVar.equals("10110101"))finalvar ="A'B + A'C' + BC' + AB'C";
        else if(tempVar.equals("10110110"))finalvar = "A'B + A'C' + AC";else if(tempVar.equals("10110111"))finalvar ="AC + A'C' + B";
        else if(tempVar.equals("10111000"))finalvar = "A'B + B'C'";else if(tempVar.equals("10111001"))finalvar ="C' + A'B";
        else if(tempVar.equals("10111010"))finalvar = "A'C' + B'C' + BC";else if(tempVar.equals("10111011"))finalvar ="B + C'";
        else if(tempVar.equals("10111100"))finalvar = "A'B + A'C' + AB'";else if(tempVar.equals("10111101"))finalvar ="C' + A'B + AB'";
        else if(tempVar.equals("10111110"))finalvar = "A'B + AC + B'C'";else if(tempVar.equals("10111111"))finalvar ="A + BC + A'C'";
        else if(tempVar.equals("11000000"))finalvar = "A'B'";else if(tempVar.equals("11000001"))finalvar ="A'B' + ABC'";
        else if(tempVar.equals("11000010"))finalvar = "A'B' + ABC";else if(tempVar.equals("11000011"))finalvar ="A'B' + AB";
        else if(tempVar.equals("11000100"))finalvar = "A'B' + B'C";else if(tempVar.equals("11000101"))finalvar ="A'B' + B'C + ABC'";
        else if(tempVar.equals("11000110"))finalvar = "A'B' + AC";else if(tempVar.equals("11000111"))finalvar ="A'B' + AC + AB";
        else if(tempVar.equals("11001000"))finalvar = "A'B' + B'C'";else if(tempVar.equals("11001001"))finalvar ="A'B' + AC'";
        else if(tempVar.equals("11001010"))finalvar = "A'B' + B'C' + ABC";else if(tempVar.equals("11001011"))finalvar ="A'B' + AB + AC'";
        else if(tempVar.equals("11001100"))finalvar = "B'";else if(tempVar.equals("11001101"))finalvar ="B' + AC'";
        else if(tempVar.equals("11001110"))finalvar = "B' + AC";else if(tempVar.equals("11001111"))finalvar ="A + B'";
        else if(tempVar.equals("11010000"))finalvar = "A'B' + A'C'";else if(tempVar.equals("11010001"))finalvar ="A'B' + BC'";
        else if(tempVar.equals("11010010"))finalvar = "A'B' + A'C' + ABC";else if(tempVar.equals("11010011"))finalvar ="A'B' + A'C' + AB";
        else if(tempVar.equals("11010100"))finalvar = "A'B' + A'C' + B'C";else if(tempVar.equals("11010101"))finalvar ="A'C' + B'C + BC'";//by kaushal faldu
        else if(tempVar.equals("11010110"))finalvar = "A'B' + A'C' + AC";else if(tempVar.equals("11010111"))finalvar ="A'B' + AC + BC'";
        else if(tempVar.equals("11011000"))finalvar = "A'B' + A'C' + B'C'";else if(tempVar.equals("11011001"))finalvar ="C' + A'B'";
        else if(tempVar.equals("11011010"))finalvar = "A'B' + A'C' + B'C' + ABC";else if(tempVar.equals("11011011"))finalvar ="A'B' + A'C' + AB + AC'";
        else if(tempVar.equals("11011100"))finalvar = "B' + A'C'";else if(tempVar.equals("11011101"))finalvar ="B' + C'";
        else if(tempVar.equals("11011110"))finalvar = "B' + A'C' + AC";else if(tempVar.equals("11011111"))finalvar ="B' + A'C' + AB";
        else if(tempVar.equals("11100000"))finalvar = "A'B' + A'C";else if(tempVar.equals("11100001"))finalvar ="A'B' + A'C + ABC'";
        else if(tempVar.equals("11100010"))finalvar = "A'B' + BC";else if(tempVar.equals("11100011"))finalvar ="A'B' + BC + AB";
        else if(tempVar.equals("11100100"))finalvar = "A'B' + A'C + B'C";else if(tempVar.equals("11100101"))finalvar ="A'B' + A'C + B'C + ABC'";
        else if(tempVar.equals("11100110"))finalvar = "A'B' + C";else if(tempVar.equals("11100111"))finalvar ="A'B' + AB + C";
        else if(tempVar.equals("11101000"))finalvar = "B'C' + A'C";else if(tempVar.equals("11101001"))finalvar ="A'C + AC' + B'C'";
        else if(tempVar.equals("11101010"))finalvar = "A'B' + B'C' + BC";else if(tempVar.equals("11101011"))finalvar ="A'B' + AC' + B'C' + BC";
        else if(tempVar.equals("11101100"))finalvar = "B' + A'C";else if(tempVar.equals("11101101"))finalvar ="B' + A'C + AC'";
        else if(tempVar.equals("11101110"))finalvar = "B' + C";else if(tempVar.equals("11101111"))finalvar ="A + B' + C";
        else if(tempVar.equals("11110000"))finalvar = "A'";else if(tempVar.equals("11110001"))finalvar ="A' + BC'";
        else if(tempVar.equals("11110010"))finalvar = "A' + BC";else if(tempVar.equals("11110011"))finalvar ="A' + B";
        else if(tempVar.equals("11110100"))finalvar = "A' + B'C";else if(tempVar.equals("11110101"))finalvar ="A' + B'C + BC'";
        else if(tempVar.equals("11110110"))finalvar = "A' + C";else if(tempVar.equals("11110111"))finalvar ="A' + AC + AB";
        else if(tempVar.equals("11111000"))finalvar = "A' + AB'C'";else if(tempVar.equals("11111001"))finalvar ="A' + B'C' + BC'";
        else if(tempVar.equals("11111010"))finalvar = "A' + B'C' + BC";else if(tempVar.equals("11111011"))finalvar ="A' + AB + B'C'";
        else if(tempVar.equals("11111100"))finalvar = "A' + AB'";else if(tempVar.equals("11111101"))finalvar ="A' + B'C + BC'";
        else if(tempVar.equals("11111110"))finalvar = "A' + AB' + AC";else if(tempVar.equals("11111111"))finalvar ="1";
//by kaushal faldu
        t[16].setText(finalvar);


        }
		public static void main(String[] args) {
        new K3();
    }

    }


