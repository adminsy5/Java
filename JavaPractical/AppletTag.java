/*
<applet code="AppletTag.java" width="300" height="300">
<param name="N" value="10" />
</applet>
*/

import java.applet.Applet;
import java.awt.*;

public class AppletTag extends Applet{
	
	public void paint(Graphics g){
		String n = getParameter("N");
		int num = Integer.parseInt(n);
		for(int i = 0; i < num; i++){
			g.drawString("Object "+(i+1), 10, 10+(i*15));
		}
	}
}
