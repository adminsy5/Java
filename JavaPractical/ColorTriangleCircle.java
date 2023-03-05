
import java.applet.Applet; 
import java.awt.*; 
  
/*
<applet code="ColorTriangleCircle.java" height=400 width=400></applet>
*/

public class ColorTriangleCircle extends Applet { 
    public void paint(Graphics g) { 
        int x[] = { 150, 250, 200 }; 
        int y[] = { 200, 200, 100 }; 
        int num = 3; 
        // Draw the triangle with red color 
        g.setColor(Color.RED); 
        g.fillPolygon(x, y, num); 
        // Draw the circle with blue color 
        g.setColor(Color.BLUE); 
        g.drawOval(100, 100, 200, 200); 
    } 
}