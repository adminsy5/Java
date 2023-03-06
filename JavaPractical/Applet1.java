import java.applet.*;
import java.awt.*;
/*<applet code=Applet1 width=400 height=500>
</applet>*/
public class Applet1 extends Applet
{
	public void init()
	{
		setBackground(Color.pink);
		setForeground(Color.yellow);
	}
	public void paint(Graphics g)
	{
		g.drawString("Welcome to Applets",40,50);
g.drawLine(30,30,200,200);
	}
}