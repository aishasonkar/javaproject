import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class orderm extends JFrame implements ActionListener
{
	

	JLabel l1,l2,l3;
	JButton b1,b2;
	JTextField t1;
	public orderm()
	{
		setLayout(null);
		setTitle("issue screen");
		//getContentPane().setBackground(new ImageIcon("glasses.jpg"));
		l1=new JLabel("ORDER SCREEN",JLabel.CENTER);
		l1.setFont(new Font("Lucida Calligraphy",Font.BOLD, 60));
		l1.setForeground(Color.blue);
		l1.setBounds(200,20,700,60);
                add(l1);
		l2=new JLabel("orderno.",JLabel.CENTER);
		l2.setFont(new Font("Algerian", Font.BOLD, 40));
		l2.setForeground(new Color(255,80,80));
                l2.setBounds(200,110,300,50);
                
                add(l2);
		t1=new JTextField(20);
                 t1.setBounds(440,120,270,35);
                 add(t1);
		t1.setEnabled(false);
		b1=new JButton("Order");
		b1.setBounds(160,300,130,60);
		
		b1.setForeground(new Color(255,80,80));
		add(b1);
		b1.addActionListener(this);
		b2=new JButton("Bill");
	
		b2.setBounds(360,300,130,60);
		add(b2);
		b2.setForeground(new Color(255,80,80));
		
		b2.addActionListener(this);
		getIcode();	
	
	}
			void getIcode()
			{
			try
			{	
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:jaggicitydsn");
				Statement stmt=con.createStatement();
				String query="select orderno from icecreamissue";
				ResultSet rs=stmt.executeQuery(query);

					
				int ic=0;
				while(rs.next())
				{
				ic=rs.getInt("orderno");
				}
				if(ic==0)
					t1.setText("5001");
				else
				{
				ic=ic+1;
				t1.setText(""+ic);
				}
				con.close();
				}
				catch(Exception e)
				{
				JOptionPane.showMessageDialog(null,"Error :"+e);
				}
			}
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
				
				new icecream(t1.getText());
			
			}
			/*else if(ae.getSource()==b3)
			{
				
				new icecream(t1.getText());
			
			}*/
		
		}
		public static void main(String args[])
		{
		orderm c = new orderm();
		c.setSize(800,800);
		c.setVisible(true);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		}
}