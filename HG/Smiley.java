// Java program to Draw a
// Smiley using Java Applet
import java.applet.*;
import java.awt.*;
/*<applet code=Smiley width=400 height=500>
</applet>*/
public class Smiley extends Applet {
public void init()
	{
		setBackground(Color.pink);
		setForeground(Color.yellow);
	}
	public void paint(Graphics g)
	{	g.setColor(Color.yellow);
		// Oval for face outline
		g.fillOval(80, 70, 150, 150);
		// Ovals for eyes
		// with black color filled
		g.setColor(Color.BLACK);
		g.fillOval(120, 120, 15, 15);
		g.fillOval(170, 120, 15, 15);
		// Arc for the smile


		g.drawArc(130, 180, 50, 20, 180, 180);
		}
}
