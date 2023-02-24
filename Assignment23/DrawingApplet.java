
/*<applet code="DrawingApplet.class" width="1000" height="1000">
<param name="numberOfShapes" value=100>
</applet>*/
import java.applet.Applet;
import java.awt.*;

public class DrawingApplet extends Applet {
    private int numberOfShapes = 100;

    public void init() {
        String numberOfShapesStr = getParameter("numberOfShapes");
        if (numberOfShapesStr != null) {
            numberOfShapes = Integer.parseInt(numberOfShapesStr);
        }
    }

    public void paint(Graphics g) {
        for (int i = 0; i <= numberOfShapes; i++) {
            g.setColor(new Color(i * 10, i * 20, i * 30));
            g.fillRect(i * 100, i * 100, 100, 100);

            g.setColor(new Color(i * 20, i * 30, i * 40));
            g.fillOval(i * 100, i * 100, 100, 100);
        }
    }
}