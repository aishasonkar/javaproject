import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class issueicecream extends JFrame implements ActionListener
{
	
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l,bcode;
	ImageIcon i1;
	String code,orno;
	JTextField  t1,t2,t3,t4,t5,t6,tcode;
	JButton b1,b2,b3,b4; 
	
	public issueicecream(String orno,String code)
	{
		//this();
		
		setLayout(null);
		this.orno=orno;
		this.code=code;
	
	
		setTitle("issue screen");
		getContentPane().setBackground(Color.white);
	
		l1=new JLabel("ISSUE SCREEN",JLabel.CENTER);
		l1.setFont(new Font("Lucida Calligraphy",Font.BOLD, 60));
		l1.setForeground(Color.blue);
		l1.setBounds(200,20,700,60);
                add(l1);
		
                l2=new JLabel("Icode",JLabel.CENTER);
		l2.setFont(new Font("Algerian", Font.BOLD, 40));
		l2.setForeground(new Color(255,80,80));
                l2.setBounds(120,110,300,50);
                
                add(l2);
                 l3=new JLabel("Iname",JLabel.CENTER);
                 l3.setFont(new Font("Algerian", Font.BOLD, 40));
		l3.setForeground(new Color(255,80,80));
                 l3.setBounds(120,170,300,50);
                 add(l3);
		 l4=new JLabel("Irate",JLabel.CENTER);
		l4.setFont(new Font("Algerian", Font.BOLD, 40));
		l4.setForeground(new Color(255,80,80));
                 l4.setBounds(120,230,300,50);
                 add(l4);
		 l5=new JLabel("Ipic",JLabel.CENTER);
		l5.setFont(new Font("Algerian", Font.BOLD, 40));
		l5.setForeground(new Color(255,80,80));
                 l5.setBounds(120,290,300,50);
                 add(l5);
		l6=new JLabel("Iorder",JLabel.CENTER);
		l6.setFont(new Font("Algerian", Font.BOLD, 40));
		l6.setForeground(new Color(255,80,80));
                 l6.setBounds(600,120,300,50);
                 add(l6);
		l7=new JLabel("Iqty",JLabel.CENTER);
		l7.setFont(new Font("Algerian", Font.BOLD, 40));
		l7.setForeground(new Color(255,80,80));
                 l7.setBounds(600,180,300,50);
                 add(l7);
		l8=new JLabel("Trate",JLabel.CENTER);
		l8.setFont(new Font("Algerian", Font.BOLD, 40));
		l8.setForeground(new Color(255,80,80));
                 l8.setBounds(600,240,300,50);
                 add(l8);
		
		i1=new ImageIcon("vh.JPG");
		tcode=new JTextField(20);
                 tcode.setBounds(340,120,290,45);
                 add(tcode);
		 tcode.setText(""+code);
		 t1=new JTextField();
                 t1.setBounds(340,180,270,35);
        
      		  add(t1);
                t2=new JTextField(20);
                t2.setBounds(340,240,270,35);
                add(t2);
		t2.setEnabled(false);
		l=new JLabel(i1);
		l.setBounds(340,300,400,240);
		add(l);
		
		t3=new JTextField(30);
		t3.setBounds(850,120,270,35);
		add(t3);
		t3.setText(""+orno);
		t3.setEnabled(false);
		t4=new JTextField(30);
		t4.setBounds(850,180,270,35);
		add(t4);
		t5=new JTextField(30);
		t5.setBounds(850,240,270,35);
		add(t5);
		t5.addFocusListener(new FocusAdapter()
					{
						public void focusLost(FocusEvent fe)
						{
							trate();
						}
					});
		b1=new JButton("issue");
		b1.setBounds(160,550,130,60);
		
		b1.setForeground(new Color(255,80,80));
		add(b1);
		b1.addActionListener(this);
		b2=new JButton("clear");
	
		b2.setBounds(360,550,130,60);
		add(b2);
		b2.addActionListener(this);
		b2.setForeground(new Color(255,80,80));
		//b3=new JButton("back");
	
		//b3.setBounds(760,500,130,60);
		//add(b3);
		//b3.setForeground(new Color(255,80,80));
		
		//b3.addActionListener(this);
		getdetails();
		
		}
		
		
		void getdetails()
		{
			try
			{	
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:jaggicitydsn");
				Statement stmt=con.createStatement();
				String query="select * from tblicecreams where icecode="+code;
				ResultSet rs=stmt.executeQuery(query);
				
				while(rs.next())
				{
					
					t1.setText(""+rs.getString("icename"));
					t2.setText(""+rs.getInt("icerate"));
					ImageIcon i2=new ImageIcon(""+rs.getString("icepic"));
					l.setIcon(i2);
						
				}
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Error :"+e);
			}
				
		}
		void trate()
		{
			int a,b,c;
			try
			{	
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:jaggicitydsn");
				Statement stmt=con.createStatement();
				a=Integer.parseInt(t2.getText());
				b=Integer.parseInt(t4.getText());
				if(a>1)
				{
					c=a*b;
					//t5.requestFocus();
					t5.setText(""+c);
				}
				
			
				
			
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Error :"+e);
			}
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				
				int a,b,c;
				
				if(ae.getSource()==b1)
				{
				try
				{	
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:jaggicitydsn");
					Statement stmt=con.createStatement();
				
					String query1="insert into icecreamissue(orderno,icecode,icename,icerate,iceqty,trate)values ("+orno+","+code+",'"+t1.getText()+"',"+t2.getText()+","+t4.getText()+","+t5.getText()+")"; 
					int y=stmt.executeUpdate(query1);
					
					
					JOptionPane.showMessageDialog(null,"item issued");
				}
					
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"Error :"+e);
				
		
				}		
				}
				else if(ae.getSource()==b2)
				{
				try
				{	
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:jaggicitydsn");
					Statement stmt=con.createStatement();
					int ans =JOptionPane.showConfirmDialog(null,"Are you confirm");
					if(ans==JOptionPane.YES_OPTION)
					{
							icecreambill e=new icecreambill(orno);
							e.setBounds(10,10,510,410);
							e.show();
					}
					JOptionPane.showMessageDialog(null,"item issued");
				}	
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"Error :"+e);
				
		
				}
				}
				else
				{
					new icecream("2001");
				}		
				
		}
		public static void main(String args[])
		{
		issueicecream c = new issueicecream("5001","2001");
		c.setSize(800,800);
		c.setVisible(true);
		c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		}

}