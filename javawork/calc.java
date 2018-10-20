import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class calc extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	public calc()
	{
		setLayout(null);
		l1=new JLabel("CALCULATOR");
		l1.setBounds(200,20,300,50);
                add(l1);
                l2=new JLabel("Enter First No.");
                l2.setBounds(120,50,300,50);
                add(l2);
                 l3=new JLabel("Enter second No.");
                 l3.setBounds(120,100,300,50);
                 add(l3);
		 l4=new JLabel("result is");
                 l4.setBounds(90,220,250,100);
                 add(l4);
                 t1=new JTextField(30);
                 t1.setBounds(240,60,250,25);
                 add(t1);
                t2=new JTextField(30);
                t2.setBounds(240,110,250,25);
                add(t2);
		t3=new JTextField(10);
		t3.setBounds(180,250,300,50);
		add(t3);
		b1=new JButton("+");
		b1.setBounds(115,180,50,50);
		add(b1);
		b1.addActionListener(this);
		b2=new JButton("-");
		b2.setBounds(215,180,50,50);
		add(b2);
		b2.addActionListener(this);
		b3=new JButton("*");
		b3.setBounds(315,180,50,50);
		add(b3);
		b3.addActionListener(this);
		b4=new JButton("/");
		b4.setBounds(415,180,50,50);
		add(b4);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent me)
	{
		String s;
		s=me.getActionCommand();
		int x,y;
		x=Integer.parseInt(t1.getText());
		y=Integer.parseInt(t2.getText());
		if(s.equals("+"))
		{
			t3.setText(Integer.toString(x+y));
		}
		else if(s.equals("-"))
		{
			t3.setText(Integer.toString(x-y));
		}
		else if(s.equals("*"))
		{
			t3.setText(Integer.toString(x*y));
		}
		else
		{

			try
			{
				if(y!=0)
				{
					t3.setText(Integer.toString(x/y));
				}
				else
				{
					throw 0;
				}
			}
			catch(ArithmeticException e)
			{
				System.out.println("can divide a no. by zero");
			}
			
			
	
				
		}
	}
	public static void main(String args[])
	{
		calc c=new calc();
		c.setSize(800,800);
		c.setVisible(true);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

		

	
	
	
	