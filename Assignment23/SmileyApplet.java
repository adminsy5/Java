import java.applet.Applet;
import java.awt.*;

/*<applet code="SmileyApplet" height=300 width=400></applet>*/
public class SmileyApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(60, 60, 150, 150); // For face

        g.setColor(Color.black);
        g.fillOval(95, 98, 15, 25); // Left Eye
        g.fillOval(160, 98, 15, 25); // Right Eye

        g.drawArc(95, 125, 78, 50, 0, -180); // Smile
    }
}