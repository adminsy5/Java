//addition of 2 number using parameters in applet

import java.awt.*;
import java.applet.*;

/*
<applet code="AppletAdd2" width=500 height=500>
<param name="a" value="10">
<param name="b" value="20">
</applet>
*/

public class AppletAdd2 extends Applet
{
	int a;
	int b;

	public void start()
	{
		String param;
		param = getParameter("a");
		a = Integer.parseInt(param);

		param = getParameter("b");
		b = Integer.parseInt(param);
	}
	public void paint(Graphics g)
	{
		g.drawString("hello I am James Gosling and very funny", 30, 30);
		g.drawString("sum of two num is  " + (a + b), 15, 15);
	}
}
