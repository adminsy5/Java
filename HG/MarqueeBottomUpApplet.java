//marquee that moves from Bottom To Top using applet

import java.awt.*;
import java.applet.*;
/*
<applet code="MarqueeBottomUpApplet" width=800 height=600>
</applet>
*/

public class MarqueeBottomUpApplet extends Applet implements Runnable
{
	String s = "James Gosling";
	Thread t = null;
	boolean bflg = false;//bflg contains Thread running status
	int y = 600;

	public void init()
	{
		setBackground(Color.cyan);
		setForeground(Color.red);
	}

	public void start()
	{
		t = new Thread(this);
		bflg = true;
		t.start();
	}

	public void run()
	{
		while (bflg == true)
		{
			try
			{
				repaint();
				Thread.sleep(200);
			}
			catch (Exception e)
			{
			}
		}
	}

	public void stop()
	{
		bflg = false;
		t = null;
	}

	public void paint(Graphics g)
	{
		y -= 5;
		if (y < 0) 
			y = 600;

		g.drawString(s, 20, y);
	}
}