//TO make calci

import java.awt.*;  
import java.awt.event.*;

class Calci implements ActionListener
{
   TextField t1,t2,t3,t4;
   Button cls,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    String s1,s2,s3,s4;
    char c1;
    int chk,i1,i2,i3,result;
    Calci()
	{
		//frame
    Frame f=new Frame("Calculator"); 
     f.setLayout(new GridLayout(5,5,10,10));    
    f.setBounds(850,250,650,400);   
    f.setVisible(true);  
    f.setResizable(false);
    //icon
    Image icon = Toolkit.getDefaultToolkit().getImage("/root/Music/java/1.png");  
    f.setIconImage(icon);  
    
    //window closing

     f.addWindowListener(new WindowAdapter()
     {
            public void windowClosing(WindowEvent we)
             {
                System.exit(0);
             }
      } );
 
     //TextField
     t1=new TextField();
     t2=new TextField();
     t3=new TextField();
     t4=new TextField();
 
     //t1.setSize(40,20);
      f.add(t1);
      f.add(t2);
      f.add(t3);
       b10=new Button("=");
       f.add(b10);
       b10.addActionListener(this);
       
       f.add(t4);
      //Clear Button
      cls=new Button("Clear");
      f.add(cls);
     cls.addActionListener(this); 
	//numbers
    

    

     b11=new Button("+");
     b11.addActionListener(this);
     f.add(b11);

     b12=new Button("-");
     f.add(b12);
     b12.addActionListener(this);
     
     b13=new Button("*");
     f.add(b13);
     b13.addActionListener(this);
     
     b14=new Button("/");
     f.add(b14);
     b14.addActionListener(this);
     
     b15=new Button("x^2");
     f.add(b15);
     b15.addActionListener(this);
     
     b16=new Button("x^3");
     f.add(b16);
     b16.addActionListener(this);
     
     b0=new Button("0");
     b0.addActionListener(this);

     b1=new Button("1");
     b1.addActionListener(this);

     b2=new Button("2");
     b2.addActionListener(this);

     b3=new Button("3");
     b3.addActionListener(this);

      b4=new Button("4");
     b4.addActionListener(this);

      b5=new Button("5");
     b5.addActionListener(this);

      b6=new Button("6");
     b6.addActionListener(this);

      b7=new Button("7");
     b7.addActionListener(this);

      b8=new Button("8");
    b8.addActionListener(this);

      b9=new Button("9");
     b9.addActionListener(this);
     
     f.add(b0);f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);
	
    }
    public void actionPerformed(ActionEvent e)
    {

    	if(e.getSource()==cls)
    	{
    	t1.setText("");
    	t2.setText("");
    	t3.setText("");	
        t4.setText("");
        }
        if(e.getSource()==b0)
        {
        	s1=t1.getText();
        	s2=s1+0;
        	t1.setText(s2);
        }
        if(e.getSource()==b1)
        {
        	s1=t1.getText();
        	s2=s1+1;
        	t1.setText(s2);
        }
        if(e.getSource()==b2)
        {
        	s1=t1.getText();
        	s2=s1+2;
        	t1.setText(s2);
        }
        if(e.getSource()==b3)
        {
        	s1=t1.getText();
        	s2=s1+3;
        	t1.setText(s2);
        }
        if(e.getSource()==b4)
        {
        	s1=t1.getText();
        	s2=s1+4;
        	t1.setText(s2);
        }
        if(e.getSource()==b5)
        {
        	s1=t1.getText();
        	s2=s1+5;
        	t1.setText(s2);
        }
        if(e.getSource()==b6)
        {
        	s1=t1.getText();
        	s2=s1+6;
        	t1.setText(s2);
        }
        if(e.getSource()==b7)
        {
        	s1=t1.getText();
        	s2=s1+7;
        	t1.setText(s2);
        }
        if(e.getSource()==b8)
        {
        	s1=t1.getText();
        	s2=s1+8;
        	t1.setText(s2);
        }
        if(e.getSource()==b9)
        {
        	s1=t1.getText();
        	s2=s1+9;
        	t1.setText(s2);
        }
        if(e.getSource()==b11)
        {
        	t2.setText("+");
        	chk=1;
        }
        if(e.getSource()==b12)
        {
        	t2.setText("-");
        	chk=2;
        }
        if(e.getSource()==b13)
        {
        	t2.setText("*");
        	chk=3;
        }
        if(e.getSource()==b14)
        {
        	t2.setText("/");
        	chk=4;
        }
        if(e.getSource()==b15)
        {
        	t2.setText("X^2");
        	chk=5;
        }
        if(e.getSource()==b16)
        {
        	t2.setText("X^3");
        	chk=6;
        }
        if(e.getSource()==b10)
        {
        	
            s2=t2.getText();

            if(chk==1 || s2=="+")
            {
            	s1=t1.getText();
        	    s3=t3.getText();
                i1=Integer.parseInt(s1);
                i2=Integer.parseInt(s3);
            	result=i1+i2;
                s4=Integer.toString(result);
            	t4.setText(s4);
            } 
            if(chk==2 || s2=="-")
            {
            	s1=t1.getText();
        	    s3=t3.getText();
                i1=Integer.parseInt(s1);
                i2=Integer.parseInt(s3);
            	result=i1-i2;
            	s4=Integer.toString(result);
            	t4.setText(s4);
            }
            if(chk==3 || s2=="*")
            {
            	s1=t1.getText();
        	    s3=t3.getText();
                i1=Integer.parseInt(s1);
                i2=Integer.parseInt(s3);
            	result=i1*i2;
            	s4=Integer.toString(result);
            	t4.setText(s4);
            }
        	if(chk==4 || s2=="/")
        	{
        		s1=t1.getText();
        	     s3=t3.getText();
                 i1=Integer.parseInt(s1);
                 i2=Integer.parseInt(s3);
        		result=i1/i2;
        		s4=Integer.toString(result);
        		t4.setText(s4);
        	}
        	if(chk==5 || s2=="X^2")
        	{
        		s1=t1.getText();
                i1=Integer.parseInt(s1);
        		result=i1*i1;
        		s4=Integer.toString(result);
        		t4.setText(s4);
        	}
        	if(chk==6 || s2=="X^3")
        	{
        		s1=t1.getText();
        		i1=Integer.parseInt(s1);
        		result=i1*i1*i1;
        		s4=Integer.toString(result);
        		t4.setText(s4);
        	}
        }
    }

  public static void main(String args[])
  {
  	Calci ck=new Calci();

  }

}