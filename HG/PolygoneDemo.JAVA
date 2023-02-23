//Draw Polygon using applet

import java.awt.*;
import java.applet.*;
/*
<applet code="PolygoneDemo" width="800" height="600">
</applet>
*/

public class PolygoneDemo extends Applet
{
	public void paint(Graphics g)
	{
		int xp[] = { 50, 100, 100, 1, 1, 50 };
		int yp[] = { 50, 100, 200, 200, 100, 50 };

		g.drawPolygon(xp, yp, xp.length);
		
	}
}