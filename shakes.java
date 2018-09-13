import 	java.awt.*;
import javax.swing.*;
import 	java.awt.event.*;

public class shakes implements ActionListener 
{
	ImageIcon i,i1,i2,i3,i4,i5,i6,i7,i8;
	String ono;
	JFrame f;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	 public shakes(String ono)
	{
		this.ono=ono;
		
		
		f=new JFrame();
	
		
		i1=new ImageIcon("Banana-Milkshake.JPG");
   		i2=new ImageIcon("mango-smoothie.JPG");
   		i3=new ImageIcon("papaya.JPG");
		i4=new ImageIcon("1831483.JPG");
		i5=new ImageIcon("chocolate-shake.jpg");
		i6=new ImageIcon("pineapple.JPG");
		i7=new ImageIcon("orange.JPG");
		i8=new ImageIcon("pomegranate.JPG");
		  b1=new JButton(i1);		

		b2=new JButton(i2);    		
		 b3=new JButton(i3);
		b4=new JButton(i4);  
   		  b5=new JButton(i5);  
     	       	 b6=new JButton(i6);
                 b7=new JButton(i7);  
                b8=new JButton(i8);  
               //b9=new JButton("9");
		
		 f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);
		f.add(b8);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		f.setLayout(new GridLayout(3,3)); 
    		f.setSize(300,300);  
    		f.setVisible(true);
   		 f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
			{
				issueshake c=new issueshake(ono,"1001");
				c.setSize(800,800);
				c.setVisible(true);
				c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}	
			else if(e.getSource()==b2)
			{	
				issueshake c=new issueshake(ono,"1002");
				c.setSize(800,800);
				c.setVisible(true);
				c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			else if(e.getSource()==b3)
			{
				issueshake c=new issueshake(ono,"1003");
				c.setSize(800,800);
				c.setVisible(true);
				c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			
			else if(e.getSource()==b4)
			{
				issueshake c=new issueshake(ono,"1004");
				c.setSize(800,800);
				c.setVisible(true);
				c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			else if(e.getSource()==b5)
			{
				issueshake c=new issueshake(ono,"1005");
				c.setSize(800,800);
				c.setVisible(true);
				c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			else if(e.getSource()==b6)
			{
				issueshake c=new issueshake(ono,"1006");
				c.setSize(800,800);
				c.setVisible(true);
				c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			else if(e.getSource()==b7)
			{
				issueshake c=new issueshake(ono,"1007");
				c.setSize(800,800);
				c.setVisible(true);
				c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			else if(e.getSource()==b8)
			{
				issueshake c=new issueshake(ono,"1008");
				c.setSize(800,800);
				c.setVisible(true);
				c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			else 
			{
				issueshake c=new issueshake(ono,"1009");
				c.setSize(800,800);
				c.setVisible(true);
				c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		}
		public static void main(String args[]){
		new shakes("");		  
	}

}  