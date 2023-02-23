//Banner applet that rotates the message character right to left


import java.awt.*;
import java.applet.*;
/*
<applet code="CharRotateApplet" width=300 height=300>
</applet>
*/

public class CharRotateApplet extends Applet implements Runnable
{
	String s = "James Gosling the founder of java program...";
	Thread t = null;
	boolean bflg = false;//bflg contains Thread running status

	public void init()
	{
		setBackground(Color.white);
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
				char ch = s.charAt(0);
				String s1 = s.substring(1);
				s = s1 + ch;
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
		g.drawString(s, 10, 20);
	}
}