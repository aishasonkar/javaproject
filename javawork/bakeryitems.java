import 	java.awt.*;
import javax.swing.*;
import 	java.awt.event.*;

public class bakeryitems implements ActionListener 
{
	String ono;
	ImageIcon i1,i2,i3,i4,i5,i6,i7,i8,i9;
	
	JFrame f;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	 public bakeryitems(String ono)
	{
		
		f=new JFrame();
		this.ono=ono;
		i1=new ImageIcon("bread.JPG");
   		i2=new ImageIcon("cake-rusk.JPG");
   		i3=new ImageIcon("bakery-bread.JPG");
		i4=new ImageIcon("burger.JPG");
		i5=new ImageIcon("biscuit.jpg");
		i6=new ImageIcon("pestry.JPG");
		i7=new ImageIcon("cookies.JPG");
		i8=new ImageIcon("delicious-cream-roll.JPG");
		i9=new ImageIcon("rusk.PNG");
		  b1=new JButton(i1);
		

		b2=new JButton(i2);    		
		 b3=new JButton(i3);
		 b4=new JButton(i4);  
   		  b5=new JButton(i5);  
     	       	 b6=new JButton(i6);
                 b7=new JButton(i7);  
                b8=new JButton(i8);  
               b9=new JButton(i9);
		
		 f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);
		f.add(b8);f.add(b9);
		b1.addActionListener(this);
		b2.addActionListener(this); 
		
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this); 
		
		b7.addActionListener(this);
		b8.addActionListener(this);
		
		f.setLayout(new GridLayout(3,3)); 
    		f.setSize(1500,1500);  
    		f.setVisible(true);
   		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
			{
				issuebakeryitems b=new issuebakeryitems(ono,"3001");
				b.getdetails();
				b.setSize(800,800);
				b.setVisible(true);
				b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}	
			else if(e.getSource()==b2)
			{
				issuebakeryitems b=new issuebakeryitems(ono,"3002");
				b.setSize(800,800);
				b.setVisible(true);
				b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			else if(e.getSource()==b3)
			{
				issuebakeryitems b=new issuebakeryitems(ono,"3003");
				b.setSize(800,800);
				b.setVisible(true);
				b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			
			else if(e.getSource()==b4)
			{
				issuebakeryitems b=new issuebakeryitems(ono,"3004");
				b.setSize(800,800);
				b.setVisible(true);
				b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			else if(e.getSource()==b5)
			{
				issuebakeryitems b=new issuebakeryitems(ono,"3005");
				b.setSize(1500,1500);
				b.setVisible(true);
				b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			else if(e.getSource()==b6)
			{
				issuebakeryitems b=new issuebakeryitems(ono,"3006");
				b.setSize(1500,1500);
				b.setVisible(true);
				b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			else if(e.getSource()==b7)
			{
				issuebakeryitems b=new issuebakeryitems(ono,"3007");
				b.setSize(1500,1500);
				b.setVisible(true);
				b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			else if(e.getSource()==b8)
			{
				issuebakeryitems b=new issuebakeryitems(ono,"3008");
				b.setSize(1500,1500);
				b.setVisible(true);
				b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			else
			{
				issuebakeryitems b=new issuebakeryitems(ono,"3009");
				b.setSize(1500,1500);
				b.setVisible(true);
				b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			
		}
		public static void main(String args[]){
		new bakeryitems("");		  
	}

}