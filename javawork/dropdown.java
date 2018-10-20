import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class dropdown extends JFrame
{
	JComboBox month;
	JLabel l1,l2;
	JButton b1;
	JTextField t1;
	public dropdown()
	{
		setLayout(new FlowLayout());
		l1=new JLabel("select month");
		month=new JComboBox();
		t1=new JTextField();
		t1.setEditable(false);
		l2=new JLabel("no. of days");
		for(int i=1;i<=12;i++)
		{
			month.addItem(i);
		}
		b1=new JButton("exit");
		month.addFocusListener(new FocusAdapter()
				{
					public void focusLost(FocusEvent fe)
					{
						String msg="";
						int m;
						m=Integer.parseInt(month.getSelectedItem().toString());
						if(m==12||m==1||m==2)
						{
							msg="winter";
						}	
		
						else if(m==3||m==4||m==5)
						{
							msg="spring";
						}
						else if(m==6||m==7||m==8)
						{
							msg="summer";
						}
						else
						{
							msg="Autumun";
						}
						t1.setText(msg);
					}
				});
				 
				add(month);
				add(l1);
				add(l2);
				add(b1);
				add(t1);
			b1.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{
								System.exit(0);
							}
							});
	}
	public static void main(String args[])
	{
		dropdown b=new dropdown();
		b.setSize(700,700);
		b.setVisible(true);
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}