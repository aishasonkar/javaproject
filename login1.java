import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class login1 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2,b3,b4;
	//Dimension d;
	public login1()
	{
		setLayout(null);
		setTitle("login screen");
		//setContentPane(new JLabel(new ImageIcon("person.JPEG")));
		getContentPane().setBackground(Color.orange);
		l1=new JLabel("LOGIN SCREEN",JLabel.CENTER);
		l1.setFont(new Font("Arial Black",Font.PLAIN, 60));
		l1.setForeground(Color.blue);
		l1.setBounds(200,40,700,60);
                add(l1);
                l2=new JLabel("Username",JLabel.CENTER);
		l2.setFont(new Font("Arial Black",Font.PLAIN, 40));
		l2.setForeground(Color.blue);
                l2.setBounds(200,130,300,50);
                add(l2);
                l3=new JLabel("Password",JLabel.CENTER);
		l3.setFont(new Font("Arial Black",Font.PLAIN, 40));
		l3.setForeground(Color.blue);
                l3.setBounds(200,200,300,50);
                add(l3);
		//l4=new JLabel("result is");
                //l4.setBounds(90,220,250,100);
                //add(l4);
                 t1=new JTextField(20);
                 t1.setBounds(470,140,270,35);
                 add(t1);
                 t2=new JPasswordField(20);
                 t2.setBounds(470,210,270,35);
                 add(t2);
		 //t3=new JTextField(10);
		 //t3.setBounds(180,250,300,50);
		 //add(t3);
		 b1=new JButton("Login");
		 b1.setBounds(280,290,100,50);
		 add(b1);
		 b1.addActionListener(this);
		 b2=new JButton("Clear");
		 b2.setBounds(420,290,100,50);
		 add(b2);
		 b2.addActionListener(this);
		 b3=new JButton("exit");
		 b3.setBounds(550,290,100,50);
		 add(b3);
		 b3.addActionListener(this);
		 //b4=new JButton("/");
		 //b4.setBounds(415,180,50,50);
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
		else if(ae.getSource()==b1)
		{
			try
			{	
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:jaggicitydsn");
				Statement stmt=con.createStatement();
				String query="select * from create1 where username='"+t1.getText()+"'and+password='"+t2.getText()+"'";
				ResultSet rs=stmt.executeQuery(query);
				
				int ctr=0;
				while(rs.next())
				{
					ctr++;
				}
				if(ctr==0)
				{
					JOptionPane.showMessageDialog(null,"User does not exist");
						create1 c=new create1();

						c.setSize(1500,1500);
						c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						c.setVisible(true);
				}
				else if(t1.getText().equals("")||t2.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"please write something in username and password");
					t1.requestFocus();
					t2.requestFocus();
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"login sucessfully");
					  new front1();
				}
				

				con.close();
                          }
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"Error :"+e);
				}
		}
		s=ae.getActionCommand();
		
	
		
	}
	public static void main(String args[])
	{
		login1 d=new login1();
		d.setSize(800,800);
		d.setVisible(true);
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}