import java.awt.*;  
import javax.swing.*;
import java.awt.event.*;  
  
public class front1 implements ActionListener
{  
	ImageIcon l1,l2,l3;
	JButton b1,b2,b3;
	JFrame f;  
	front1()
	{  
    	f=new JFrame();
   	l1=new ImageIcon("shakes1.JPEG");
   	l2=new ImageIcon("maxresdefault.JPG");
   	l3=new ImageIcon("baskin.JPG");  
      
     	b1=new JButton(l1);
		  
     	b2=new JButton(l2);  
     	b3=new JButton(l3);  
    	JButton b4=new JButton("4");  
    	JButton b5=new JButton("5");  
      	JButton b6=new JButton("6");  
       JButton b7=new JButton("7");  
    	JButton b8=new JButton("8");  
       JButton b9=new JButton("9");  
          
    f.add(b1);f.add(b2);f.add(b3);  
    b1.addActionListener(this);
	b3.addActionListener(this);
	b2.addActionListener(this);
    f.setLayout(new GridLayout(1,3));
	
  
    f.setSize(300,300);  
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
}
	
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
				order c = new order();
				c.setSize(800,800);
				c.setVisible(true);
				c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			
			}
			else if(ae.getSource()==b3)
			{
				orderm c = new orderm();
				c.setSize(800,800);
				c.setVisible(true);
				c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			
			}
			else 
			{
				ordern c = new ordern();
				c.setSize(800,800);
				c.setVisible(true);
				c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			
			}
		}
	  
public static void main(String[] args) {  
    new front1();  
}  
}  
