import java.awt.*;
import java.applet.Applet;
/*<applet code="circle.class"height="700" width="800"<param name="ename" value="ram"></applet>*/

public class circle extends Applet
{	
	int x[]={1,2,3,1};
	int y[]={1,2,3,1};
	public void init()
	{
		
		setBackground(Color.green);
		//setColor(Color.red);
		Font f=new Font("Arial Black",Font.BOLD,30);
		setFont(f);
	}
	public void paint(Graphics g)
		{
			
			int x[]={70,80,50,38};
			int y[]={56,78,68,59};
			g.setColor(Color.red);
			g.drawPolygon(x,y,4);
		}
}