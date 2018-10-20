import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/*<applet code="appdemo.class"height=200 width=500></applet>*/
public class appdemo extends Applet implements MouseListener
{
	int x=100,y=100,x1=200,y1=300;
	String S="welcome";
	public void init()
	{
		addMouseListener(this);
		
		
	}
	public void paint(Graphics g)
	{
		g.drawString(S,x,y);
		g.drawRect(x,y,x1,y1);
		Color c=new Color(255,0,0);
		g.setColor(c);
	}
	
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	
	public void mouseClicked(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		x1=me.getX();
		y1=me.getY();
	
	
	Color c=new Color(255,0,0);
	
	S="mouse clicked at "+x+","+y+","+x1+","+y1;
	repaint();
	
	}
	/*public void mousePressed(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		x1=me.getX();
		y1=me.getY();
	
	
	Color c=new Color(255,0,0);
	
	S="mouse clicked at "+x+","+y+","+x1+","+y1;
	repaint();
	
	}*/
	
}
