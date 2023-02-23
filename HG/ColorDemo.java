//Demonstrate Lines, rectangels in different colors using applet

import java.awt.*;
import java.applet.*;
/*
<applet code="ColorDemo" width="800" height="600">
</applet>
*/

public class ColorDemo extends Applet
{
	public void paint(Graphics g)
	{
		Color c1 = new Color(255, 0, 0);
		Color c2 = new Color(0, 255, 0);
		Color c3 = new Color(0, 0, 255);
		Color c4 = new Color(255, 255, 255);


		g.setColor(c1);
		g.drawLine(0, 0, 200, 0);

		g.setColor(c2);
		g.drawLine(200, 0, 200, 200);

		g.setColor(c3);
		g.drawLine(200, 200, 0, 200);

		g.setColor(c4);
		g.drawLine(0, 200, 0, 0);


		g.setColor(Color.pink);
		g.drawRect(300, 0, 200, 100);
		g.fillRect(600, 0, 200, 100);

		g.setColor(Color.magenta);
		g.drawArc(0, 300, 200, 100, 90, 270);
		g.fillArc(300, 300, 200, 100, 90, 270);

		g.setColor(Color.orange);
		g.drawOval(0, 0, 200, 100);
		g.fillOval(300, 0, 200, 100);
	}
}
