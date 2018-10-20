import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class button extends JFrame implements ActionListener
{
	ImageIcon l1,l2,l3,l4;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	public button()
	{
		setLayout(null);
                l1=new ImageIcon("smily.PNG");
                l2=new ImageIcon("sad.PNG");
		l3=new ImageIcon("cry.JPEG");	
                
                 /*t1=new JTextField(30);
                 t1.setBounds(150,250,50,100);
                 add(t1);
                 t2=new JTextField(30);
                  t2.setBounds(150,250,50,100);
                  add(t2);
		t3=new JTextField(10);
		t3.setBounds(150,250,50,100);
		add(t3);*/
		b1=new JButton(l1);
		b1.setBounds(200,100,220,200);
		add(b1);
		b1.addActionListener(this);
		b2=new JButton(l2);
		b2.setBounds(500,100,220,200);
		add(b2);
		b2.addActionListener(this);
		b3=new JButton(l3);
		b3.setBounds(750,100,220,200);
		add(b3);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s;
		s=ae.getActionCommand();
		//int x,y;
		b1.setActionCommand("smily");
		b2.setActionCommand("sad");
		b3.setActionCommand("cry");
		if(s.equals("smily"))
		{
			JOptionPane.showMessageDialog(null,"i am happy");
		}
		else if(s.equals("sad"))
		{
			JOptionPane.showMessageDialog(null,"i am sad");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"i am cry");
		}
		
	}
	public static void main(String args[])
	{
		button b=new button();
		b.setSize(700,700);
		b.setVisible(true);
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

		

	
	
	
	