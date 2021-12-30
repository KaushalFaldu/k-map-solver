package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class K4 extends JFrame  {
 
 static String output="";
 static int A[][]=new int[4][4];
 static int checked[][]=new int[4][4];
 static int value[]=new int[16];
 JButton btn[]=new JButton[16];
 JLabel lbl[]=new JLabel[10];
 JPanel table;
 JLabel text;
 JButton compute,reset;
 public K4()
 {
  JFrame f =new JFrame();
  f.setTitle("4 - Karnaugh map ");
  f.setSize(580, 430);
  f.setVisible(true);
  f.setLocation(300,50);
  f.setDefaultCloseOperation(EXIT_ON_CLOSE);
  f.setResizable(false);
  f.setLayout(null);
  table=new JPanel();
  text=new JLabel();
  table.setBounds(140, 30, 400, 300);
  table.setBackground(Color.BLUE);
  
  text.setBounds(0,330,580,100);
  text.setBackground(Color.white);
  //ading button in table
  table.setLayout(new GridLayout(4,4));
 
  for(int i=0;i<16;i++)
  {
   btn[i]=new JButton();
   btn[i].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
   table.add(btn[i]);
   table.validate();
   value[i]=2;
  }
  //
  lbl[0]=new JLabel("A'B'");
  lbl[0].setBounds(110,30,30,75);
  f.add(lbl[0]);
  lbl[1]=new JLabel("A'B");
  lbl[1].setBounds(110,105,30,75);
  f.add(lbl[1]);
  lbl[2]=new JLabel("AB");
  lbl[2].setBounds(110,180,30,75);
  f.add(lbl[2]);
  lbl[3]=new JLabel("AB'");
  lbl[3].setBounds(110,255,30,75);
  f.add(lbl[3]);
  lbl[4]=new JLabel("C'D'");
  lbl[4].setBounds(160,0,80,30);
  f.add(lbl[4]);
  lbl[5]=new JLabel("C'D");
  lbl[5].setBounds(260,0,80,30);
  f.add(lbl[5]);
  lbl[6]=new JLabel("CD");
  lbl[6].setBounds(360,0,80,30);
  f.add(lbl[6]);
  lbl[7]=new JLabel("CD'");
  lbl[7].setBounds(460,0,80,30);
  f.add(lbl[7]);
  f.validate();
  //
  //button dading
  
 // f.add(button);
  compute=new JButton("COMPUTE");
  compute.setBounds(5, 100, 90, 40);
  f.add(compute);
  //compute.setIcon(new ImageIcon("compute.png"));
  reset=new JButton("RESET");
  reset.setBounds(5, 160, 90, 40);
  f.add(reset);
  f.add(table);
  compute.validate();
  reset.validate();
  f.add(text);
  f.validate();
  //zero - one change change over
  btn[0].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    
    value[0]++;
    value[0]%=3;
    //text.setText("value of btn[0]"+value[0]);
    if(value[0]==0)
    {
     btn[0].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/0.jpeg"));
    }
    if(value[0]==1)
    {
     btn[0].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/1.jpeg"));
    }
    if(value[0]==2)
    {
     btn[0].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
    }
   }
  });
  
  btn[1].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    //text.setText("");
    value[1]++;
    value[1]%=3;
   // text.setText("value of btn[1]"+value[1]);
    //by kaushal faldu
    if(value[1]==0)
    {
     btn[1].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/0.jpeg"));
    }
    if(value[1]==1)
    {
     btn[1].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/1.jpeg"));
    }
    if(value[1]==2)
    {
     btn[1].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
    }
   }
  });
  //by kaushal faldu
  btn[2].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    value[2]++;
    value[2]%=3;
    if(value[2]==0)
    {
     btn[2].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/0.jpeg"));
    }
    if(value[2]==1)
    {
     btn[2].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/1.jpeg"));
    }
    if(value[2]==2)
    {
     btn[2].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
    }
   }
  });
  btn[3].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    value[3]++;
    value[3]%=3;
    if(value[3]==0)
    {
     btn[3].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/0.jpeg"));
    }
    if(value[3]==1)
    {
     btn[3].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/1.jpeg"));
    }
    if(value[3]==2)
    {
     btn[3].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
    }
   }
  });
  btn[4].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    value[4]++;
    value[4]%=3;
    if(value[4]==0)
    {
     btn[4].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/0.jpeg"));
    }
    if(value[4]==1)
    {
     btn[4].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/1.jpeg"));
    }
    if(value[4]==2)
    {
     btn[4].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
    }
   }
  });
  btn[5].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    value[5]++;
    value[5]%=3;
    if(value[5]==0)
    {
     btn[5].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/0.jpeg"));
    }
    if(value[5]==1)
    {
     btn[5].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/1.jpeg"));
    }
    if(value[5]==2)
    {
     btn[5].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
    }
   }
  });
  //by kaushal faldu
  btn[6].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    value[6]++;
    value[6]%=3;
    if(value[6]==0)
    {
     btn[6].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/0.jpeg"));
    }
    if(value[6]==1)
    {
     btn[6].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/1.jpeg"));
    }
    if(value[6]==2)
    {
     btn[6].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
    }
   }
  });
  btn[7].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    value[7]++;
    value[7]%=3;
    if(value[7]==0)
    {
     btn[7].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/0.jpeg"));
    }
    if(value[7]==1)
    {
     btn[7].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/1.jpeg"));
    }
    if(value[7]==2)
    {
     btn[7].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
    }
   }
  });
  btn[8].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    value[8]++;
    value[8]%=3;
    if(value[8]==0)
    {
     btn[8].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/0.jpeg"));
    }
    if(value[8]==1)
    {
     btn[8].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/1.jpeg"));
    }
    if(value[8]==2)
    {
     btn[8].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
    }
   }
  });
  btn[9].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    value[9]++;
    value[9]%=3;
    if(value[9]==0)
    {
     btn[9].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/0.jpeg"));
    }
    if(value[9]==1)
    {
     btn[9].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/1.jpeg"));
    }
    if(value[9]==2)
    {
     btn[9].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
    }
   }
  });
  btn[10].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    value[10]++;
    value[10]%=3;
    if(value[10]==0)
    {
     btn[10].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/0.jpeg"));
    }
    if(value[10]==1)
    {
     btn[10].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/1.jpeg"));
    }
    if(value[10]==2)
    {
     btn[10].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
    }
   }
  });
  btn[11].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    value[11]++;
    value[11]%=3;
    if(value[11]==0)
    {
     btn[11].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/0.jpeg"));
    }
    if(value[11]==1)
    {
     btn[11].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/1.jpeg"));
    }
    if(value[11]==2)
    {
     btn[11].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
    }
   }
  });
  btn[12].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    value[12]++;
    value[12]%=3;
    if(value[12]==0)
    {
     btn[12].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/0.jpeg"));
    }
    if(value[12]==1)
    {
     btn[12].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/1.jpeg"));
    }
    if(value[12]==2)
    {
     btn[12].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
    }
   }
  });
  btn[13].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    value[13]++;
    value[13]%=3;
    if(value[13]==0)
    {
     btn[13].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/0.jpeg"));
    }
    if(value[13]==1)
    {
     btn[13].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/1.jpeg"));
    }
    if(value[13]==2)
    {
     btn[13].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
    }
   }
  });
  btn[14].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    value[14]++;
    value[14]%=3;
    if(value[14]==0)
    {
     btn[14].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/0.jpeg"));
    }
    if(value[14]==1)
    {
     btn[14].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/1.jpeg"));
    }
    if(value[14]==2)
    {
     btn[14].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
    }
   }
  });
  btn[15].addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    value[15]++;
    value[15]%=3;
    if(value[15]==0)
    {
     btn[15].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/0.jpeg"));
    }
    if(value[15]==1)
    {
     btn[15].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/1.jpeg"));
    }
    if(value[15]==2)
    {
     btn[15].setIcon(new ImageIcon("D:/OOP_Project/src/PROJECT/x.jpeg"));
    }
   }
  });
  //by kaushal faldu
  //reset
  reset.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    text.setText("");
    output="";
   
    for(int i=0;i<16;i++)
    {
     btn[i].setIcon(new ImageIcon( ));
     value[i]=2;
    }
   }
  });
  //compute
  compute.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    
    compute();
    text.setText("");
  
    text.setText("SOP="+output.substring(1));
    
   }
  });
 }
 //end of constructor
 //compute Algorithm for K-MAP
 static void compute()
 {
  initialize();
  // algo bigins
  
  for(int i=0;i<4;i++)
  {
   for(int j=0;j<4;j++)
   {
    if(A[i][j]==1&&checked[i][j]==0)
    {
     int pass8=check8(i,j);
     if(pass8==0)
     {
      int pass4=check4(i,j);
      if(pass4==0)
      {
       int pass2=check2(i,j);
       if(pass2==0)
       {
        nogrouping(i,j);
       }
      }
     }
    }
   }
  }
  
 }
 //algo ends
 //by kaushal faldu
 //function for checking 8
 static int check8(int r,int c)
 {
  int result=0;
  //case1
  if(A[r][0]==1&&A[r][1]==1&&A[r][2]==1&&A[r][3]==1&&A[(r+1)%4][0]==1&&A[(r+1)%4][1]==1&&A[(r+1)%4][2]==1&&A[(r+1)%4][3]==1)
  {
   String local="";
   if(r==0)
   {
     local="A'";
   }
   if(r==1)
   {
     local="B";
   }
   if(r==2)
   {
     local="A";
   }
   if(r==3)
   {
     local="B'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][0]=1;checked[r][1]=1;checked[r][2]=1;checked[r][3]=1;
   checked[(r+1)%4][0]=1;checked[(r+1)%4][1]=1;checked[(r+1)%4][2]=1;checked[(r+1)%4][3]=1;
   // make it color
  // makecolor(r,c);
  }else
  //case2
  if(A[r][0]==1&&A[r][1]==1&&A[r][2]==1&&A[r][3]==1&&A[(4+(r-1))%4][0]==1&&A[(4+(r-1))%4][1]==1&&A[(4+(r-1))%4][2]==1&&A[(4+(r-1))%4][3]==1)
  {
   String local="";
   if(r==0)
   {
     local="B'";
   }
   if(r==1)
   {
     local="A'";
   }
   if(r==2)
   {
     local="B";
   }
   if(r==3)
   {
     local="A";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][0]=1;checked[r][1]=1;checked[r][2]=1;checked[r][3]=1;
   checked[(4+(r-1))%4][0]=1;checked[(4+(r-1))%4][1]=1;checked[(4+(r-1))%4][2]=1;checked[(4+(r-1))%4][3]=1;
  }else
  //case3
  if(A[0][c]==1&&A[1][c]==1&&A[2][c]==1&&A[3][c]==1&&A[0][(c+1)%4]==1&&A[1][(c+1)%4]==1&&A[2][(c+1)%4]==1&&A[3][(c+1)%4]==1)
  {
   String local="";
   if(c==0)
   {
     local="C'";
   }
   if(c==1)
   {
     local="D";
   }
   if(c==2)
   {
     local="C";
   }
   if(c==3)
   {
     local="D'";
   }
   output=output+"+"+local;
   result=1;
   //by kaushal faldu
   //make checked
   checked[0][c]=1;checked[1][c]=1;checked[2][c]=1;checked[3][c]=1;
   checked[0][(c+1)%4]=1;checked[1][(c+1)%4]=1;checked[2][(c+1)%4]=1;checked[3][(c+1)%4]=1;
  }else
  //case 4
  if(A[0][c]==1&&A[1][c]==1&&A[2][c]==1&&A[3][c]==1&&A[0][(4+(c-1))%4]==1&&A[1][(4+(c-1))%4]==1&&A[2][(4+(c-1))%4]==1&&A[3][(4+(c-1))%4]==1)
  {
   String local="";
   if(c==0)
   {
     local="D'";
   }
   if(c==1)
   {
     local="C'";
   }
   if(c==2)
   {
     local="D";
   }
   if(c==3)
   {
     local="C";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[0][c]=1;checked[1][c]=1;checked[2][c]=1;checked[3][c]=1;
   checked[0][(4+(c-1))%4]=1;checked[1][(4+(c-1))%4]=1;checked[2][(4+(c-1))%4]=1;checked[3][(4+(c-1))%4]=1;
  }
  
  return result;
 }
 //ends of check8
 //check4 start
 static int check4(int r,int c)
 {
  int result=0;
  String local="";
  //case1
  if(A[r][0]==1&&A[r][1]==1&&A[r][2]==1&&A[r][3]==1)
  {
   if(r==0)
   {
    local="A'B'";
   }
   if(r==1)
   {
    local="A'B";
   }
   if(r==2)
   {
    local="AB";
   }
   if(r==3)
   {
    local="AB'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][0]=1;checked[r][1]=1;checked[r][2]=1;checked[r][3]=1;
  }else
  //case2
  if(A[0][c]==1&&A[1][c]==1&&A[2][c]==1&&A[3][c]==1)
  {
   if(c==0)
   {
    local="C'D'";
   }
   if(c==1)
   {
    local="C'D";
   }
   if(c==2)
   {
    local="CD";
   }
   if(c==3)
   {
    local="CD'";
    
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[0][c]=1;checked[1][c]=1;checked[2][c]=1;checked[3][c]=1;
  }else
  //case3 row+ col+
  if(A[r][c]==1&&A[r][(c+1)%4]==1&&A[(r+1)%4][c]==1&&A[(r+1)%4][(c+1)%4]==1)
  {
   if(r==0)
   {
    local="A'";
   }
   if(r==1)
   {
    local="B";
   }
   if(r==2)
   {
    local="A";
   }
   if(r==3)
   {
    local="B'";
   }
   if(c==0)
   {
    local=local+"C'";
   }
   if(c==1)
   {
    local=local+"D";
   }
   if(c==2)
   {
    local=local+"C";
   }
   if(c==3)
   {
    local=local+"D'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][c]=1;checked[r][(c+1)%4]=1;checked[(r+1)%4][c]=1;checked[(r+1)%4][(c+1)%4]=1;
  }else
  //case4 row+ col--
  if(A[r][(4+(c-1))%4]==1&&A[r][c]==1&&A[(r+1)%4][(4+(c-1))%4]==1&&A[(r+1)%4][c]==1)
  {
   if(r==0)
   {
    local="A'";
   }
   if(r==1)
   {
    local="B";
   }
   if(r==2)
   {
    local="A";
   }
   if(r==3)
   {
    local="B'";
   }
   if(c==0)
   {
    local=local+"D'";
   }
   if(c==1)
   {
    local=local+"C'";
   }
   if(c==2)
   {
    local=local+"D";
   }
   if(c==3)
   {
    local=local+"C'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][(4+(c-1))%4]=1;checked[r][c]=1;checked[(r+1)%4][(4+(c-1))%4]=1;checked[(r+1)%4][c]=1;
   
  }else
  //case5 row - and col -
  if(A[(4+(r-1))%4][(4+(c-1))%4]==1&&A[(4+(r-1))%4][c]==1&&A[r][(4+(c-1))%4]==1&&A[r][c]==1)
  {
   if(r==0)
   {
    local="B'";
   }
   if(r==1)
   {
    local="A'";
   }
   if(r==2)
   {
    local="B";
   }
   if(r==3)
   {
    local="A";
   }
   if(c==0)
   {
    local=local+"D'";
   }
   if(c==1)
   {
    local=local+"C'";
   }
   if(c==2)
   {
    local=local+"D";
   }
   if(c==3)
   {
    local=local+"C'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[(4+(r-1))%4][(4+(c-1))%4]=1;checked[(4+(r-1))%4][c]=1;checked[r][(4+(c-1))%4]=1;checked[r][c]=1;
  }else
  //case6 row- col+
  if(A[(4+(r-1))%4][c]==1&&A[(4+(r-1))%4][(c+1)%4]==1&&A[r][c]==1&&A[r][(c+1)%4]==1)
  {
   if(r==0)
   {
    local="B'";
   }
   if(r==1)
   {
    local="A'";
   }
   if(r==2)
   {
    local="B";
   }
   if(r==3)
   {
    local="A";
   }
   if(c==0)
   {
    local=local+"C'";
   }
   if(c==1)
   {
    local=local+"D";
   }
   if(c==2)
   {
    local=local+"C";
   }
   if(c==3)
   {
    local=local+"D'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[(4+(r-1))%4][c]=1;checked[(4+(r-1))%4][(c+1)%4]=1;checked[r][c]=1;checked[r][(c+1)%4]=1;
  }
  
  return result;
 }
 //check for 2 check2
 //by kaushal faldu
 static int check2(int r,int c)
 {
  int result=0;
  String local="";
  //case 1 col++
  if(A[r][c]==1&&A[r][(c+1)%4]==1)
  {
   if(r==0)
   {
    local="A'B'";
   }
   if(r==1)
   {
    local="A'B";
   }
   if(r==2)
   {
    local="AB";
   }
   if(r==3)
   {
    local="AB'";
   }
   if(c==0)
   {
    local=local+"C'";
   }
   if(c==1)
   {
    local=local+"D";
   }
   if(c==2)
   {
    local=local+"C";
   }
   if(c==3)
   {
    local=local+"D'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][c]=1;checked[r][(c+1)%4]=1;
   
  }else
  //case 2 col--
  if(A[r][(4+(c-1))%4]==1&&A[r][c]==1)
  {
   if(r==0)
   {
    local="A'B'";
   }
   if(r==1)
   {
    local="A'B";
   }
   if(r==2)
   {
    local="AB";
   }
   if(r==3)
   {
    local="AB'";
   }
   if(c==0)
   {
    local=local+"D'";
   }
   if(c==1)
   {
    local=local+"C'";
   }
   if(c==2)
   {
    local=local+"D";
   }
   if(c==3)
   {
    local=local+"C";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][(4+(c-1))%4]=1;checked[r][c]=1;  
  }else
  //case3 row++
  if(A[r][c]==1&&A[(r+1)%4][c]==1)
  {
   if(r==0)
   {
    local="A'";
   }
   if(r==1)
   {
    local="B";
   }
   if(r==2)
   {
    local="A";
   }
   if(r==3)
   {
    local="B'";
   }
   if(c==0)
   {
    local=local+"C'D'";
   }
   if(c==1)
   {
    local=local+"C'D";
   }
   if(c==2)
   {
    local=local+"CD";
   }
   if(c==3)
   {
    local=local+"CD'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][c]=1;checked[(r+1)%4][c]=1;
   }else
  // case4 row--
  if(A[r][c]==1&&A[(4+(r-1))%4][c]==1)
  {
   if(r==0)
   {
    local="B'";
   }
   if(r==1)
   {
    local="A'";
   }
   if(r==2)
   {
    local="B";
   }
   if(r==3)
   {
    local="A";
   }
   if(c==0)
   {
    local=local+"C'D'";
   }
   if(c==1)
   {
    local=local+"C'D";
   }
   if(c==2)
   {
    local=local+"CD";
   }
   if(c==3)
   {
    local=local+"CD'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][c]=1;checked[(4+(r-1))%4][c]=1;
   }
  return result;
 }
 // no grouping
 static void nogrouping(int r, int c)
 {
  String local="";
  if(r==0)
  {
   local="A'B'";
  }
  if(r==1)
  {
   local="A'B";
  }
  if(r==2)
  {
   local="AB";
  }
  if(r==3)
  {
   local="AB'";
  }
  if(c==0)
  {
   local=local+"C'D'";
  }
  if(c==1)
  {
   local=local+"C'D";
  }
  if(c==2)
  {
   local=local+"CD";
  }
  if(c==3)
  {
   local=local+"CD'";
  }
  output=output+"+"+local;
  
  checked[r][c]=1;
 }
 
 // initialize 2D-Array
 static void initialize()
 {
  int count=0;
  for(int i=0;i<4;i++)
  {
   for(int j=0;j<4;j++)
   {
    A[i][j]=value[count];
    checked[i][j]=0;
    count++;
   }
  }
 }
 //end of initialize
 
 
 
 public static void main(String args[])
 {
  K4 object =new K4();
 }

}