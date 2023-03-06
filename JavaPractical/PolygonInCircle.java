/*
<applet code="PolygonInCircle.java" height=400 width=400></applet>
*/
import java.awt.*;
import java.applet.*;

public class PolygonInCircle extends Applet {
    public void paint(Graphics g) {
        int x[] = {100, 150, 200, 150, 100};
        int y[] = {50, 0, 50, 100, 150};
        g.drawOval(90, 40, 120, 120);
        g.setColor(Color.BLUE);
        g.fillPolygon(x, y, 5);
    }
}