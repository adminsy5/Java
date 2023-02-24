
/* <applet code=Applet1.class height=500 width=700></applet> */
import java.awt.*;
import java.applet.*;

public class Applet1 extends Applet {
    public void paint(Graphics g) {
        // Triangle
        g.setColor(Color.pink);
        int x[] = { 350, 150, 550 };
        int y[] = { 100, 350, 350 };
        int n = 3;
        g.fillPolygon(x, y, n);
        // oval
        g.setColor(Color.white);
        g.fillOval(253, 160, 195, 190);
    }
};
