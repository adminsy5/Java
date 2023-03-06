import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class CircleInsideTriangle extends Applet {

 public void paint(Graphics g) {
  
  // Draws a triangle 
 	 g.setColor(Color.blue);
	int x[] = {350, 150, 550};
	int y[] = {100, 350, 350};
	int n = 3;
	g.fillPolygon(x, y, n);  
  g.setColor(Color.YELLOW);
  g.fillPolygon(xPoints, yPoints, 3);
  
  // Draws a circle
g.setColor(Color.green);
g.fillOval(253, 160, 195, 190);
  
 }
}

/* <applet code="CircleInsideTriangle" width=250 height=250>
   </applet>
*/
