//marquee that moves an object (Bus) from Left To Right using applet

import java.awt.*;
import java.applet.*;

/*
<applet code="AppletMovBusH" width=500 height=500>
</applet>
*/

public class AppletMovBusH extends Applet implements Runnable
{
	Thread t;
	int x = 0;

	public void init()
	{
		x = 0;
		setBackground(Color.green);
		setForeground(Color.black);
		t = new Thread(this);
		t.start();
	}

	public void paint(Graphics g)
	{
		x++;
		if (x > 450)
			x = -100;

		g.setFont(new Font("Arial",3,18));
		g.drawString("Sutex Bank BCA ", 25+x, 40);

		g.drawRect(20 + x, 20, 150, 100);
		g.drawOval(40 + x, 120, 40, 40);
		g.drawOval(110 + x, 120, 40, 40);
	}

	public void run()
	{
		while (true)
		{
			repaint();
			try
			{
				Thread.sleep(100);
			}
			catch (Exception e)
			{
			}
		}
	}
}
