import java.awt.*;
import java.applet.*;

/*<applet code=CircularStar.class width=700 height=400></applet>*/
public class CircularStar extends Applet {
    int x1[] = { 115, 215, 300, 215, 115 };
    int y1[] = { 150, 100, 200, 297, 250 };
    int n1 = 5;
    int x2[] = { 500, 600, 550, 450, 405 };
    int y2[] = { 70, 150, 250, 250, 150 };
    int n2 = 5;

    public void paint(Graphics g) {
        g.setColor(Color.magenta);
        g.fillOval(100, 100, 200, 200);

        g.setColor(Color.pink);
        g.fillPolygon(x1, y1, n1);

        g.setColor(Color.yellow);
        g.fillPolygon(x2, y2, n2);

        g.setColor(Color.black);
        g.drawString("Applet", 180, 200);

        g.setColor(Color.orange);
        g.fillOval(425, 93, 155, 155);

        g.setColor(Color.black);
        g.drawString("Hello", 485, 180);
    }
}