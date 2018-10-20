import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class create extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t3;
	JPasswordField t2;
	JButton b1,b2,b3;
	public create()
	{
		setLayout(null);
		setTitle("create user");
		setContentPane(new JLabel(new ImageIcon("key.JPEG")));
		l1=new JLabel("CREATE USER SCREEN");
		
		l1.setFont(new Font("Serif", Font.BOLD, 60));
		l1.setForeground(Color.blue);

		l1.setBounds(200,20,700,60);
                add(l1);
                l2=new JLabel("Username");

		l2.setFont(new Font("Serif", Font.BOLD, 40));
		l2.setForeground(Color.white);
                l2.setBounds(120,110,300,50);
                add(l2);
                l3=new JLabel("Password");
		l3.setFont(new Font("Serif", Font.BOLD, 40));
		l3.setForeground(Color.white);
                 l3.setBounds(120,170,300,50);
                 add(l3);
		 //l4=new JLabel("result is");
                 //l4.setBounds(90,220,260,100);
                 //add(l4);
                 t1=new JTextField(20);
                 t1.setBounds(300,120,270,35);
                 add(t1);
                t2=new JPasswordField(20);
                t2.setBounds(300,180,270,35);
                add(t2);
		//t3=new JTextField(10);
		//t3.setBounds(180,250,300,50);
		//add(t3);
		b1=new JButton("create");

		b1.setBounds(115,250,120,60);
		add(b1);
		b1.setForeground(Color.blue);
		b1.addActionListener(this);
		b2=new JButton("clear");
		b2.setBounds(245,250,120,60);
		b2.setForeground(Color.blue);
		add(b2);
		b2.addActionListener(this);
		b3=new JButton("Back");
	
		b3.setBounds(385,250,120,60);
		b3.setForeground(Color.blue);
		add(b3);
		b3.addActionListener(this);
		//b4=new JButton("/");
		//b4.setBounds(415,220,100,50);
		//add(b4);
		//b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s;
		if(ae.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
		}


		if(ae.getSource()==b1)
		{ 
			try
			{

				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:inventorydsn");
				Statement stmt=con.createStatement();
				String query="select * from tbllogin where username='"+t1.getText()+"'and+password='"+t2.getText()+"'";
				ResultSet rs=stmt.executeQuery(query);
				
				int ctr=0;
				while(rs.next())
				{
					ctr++;
				}
				if(ctr==0)
				{
				String query1="insert into tbllogin(username,password)values('"+t1.getText()+"','"+t2.getText()+"')";
				int x=stmt.executeUpdate(query1);
				JOptionPane.showMessageDialog(null,"User created");
				}
				else if(t1.getText().equals("")||t2.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"please write something in username and passwordfield");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"user already exits");
					
				}

				con.close();
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Error :"+e);
			}
		}
			else if(ae.getSource()==b3)
			{
			login d=new login();
			d.setSize(800,800);
			d.setVisible(true);
			d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			dispose();
			}
	
			
		
}
	public static void main(String args[])
	{
		create c=new create();
		c.setSize(1500,1500);
		c.setVisible(true);
		c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}