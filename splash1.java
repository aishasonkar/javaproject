
																															import java.awt.*;
import javax.swing.*;	


public class splash1 extends JFrame 
{
	JLabel  l1,l2,l3,l4;
	JSplitPane splitPane;
	JPanel p1;
	ImageIcon i1;
	public splash1()
	{	
	setLayout(null);
	setBackground(Color.black);
	setContentPane(new JLabel(new ImageIcon("jaggi.JPEG")));
	l1=new JLabel("JAGGI");
	l1.setFont(new Font("Lucida Calligraphy",Font.BOLD,70));
	l1.setForeground(new Color(255,255,0));
	l1.setBounds(70,100,700,100);
	
	l2=new JLabel("CITY");
	l2.setBounds(70,250,700,80);
	l2.setFont(new Font("Algerian",Font.BOLD,70));
	l2.setForeground(new Color(255,255,0));
	
	l3=new JLabel("CENTRE");
	l3.setBounds(70,400,700,80);
	l3.setFont(new Font("Engraves MT",Font.ITALIC,70));
	l3.setForeground(new Color(255,255,0));

	l4=new JLabel("Submitted By: Simran");
	l4.setBounds(350,580,800,120);
	l4.setFont(new  Font("French Script MT",Font.ITALIC,100));
	l4.setForeground(new Color(255,255,0));
	
	
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	
	
        
	}

public static void main(String args[])
{
	splash1 s=new splash1();
	s.setSize(1500,1500);
	s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	s.setVisible(true);
	try
	{
		Thread.sleep(5000);
	}
	catch(Exception e)
	{
	}
	s.dispose();

	login1 a=new login1();

	a.setSize(1500,1500);
	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	a.setVisible(true);
}	
}