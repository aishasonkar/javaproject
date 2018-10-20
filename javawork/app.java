import java.awt.*;
import java.applet.Applet;
/*<applet code="app.class"height="700" width="800"<param name="ename" value="ram"></applet>*/

public class app extends Applet
{
  String S;
	public void init()
	{
		
		setBackground(Color.green);
		setBackground(Color.red);
		Font f=new Font("Arial Black",Font.ITALIC,30);
		setFont(f);
		S=getParameter("ename");
		if(S==null)
		{
			S="student";
		}
	}
	

		public void paint(Graphics g)
		{
		
			g.drawString("Hello"+S,500,500);
		}
	
}
