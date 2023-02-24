import java.applet.Applet;
import java.awt.*;

/*<applet code="NthObjects" width="500" height="350">
<param name="numberOfObjects" value="10">
</applet>*/
public class NthObjects extends Applet {
    private int numberOfObjects = 0;

    public void init() {
        String numberOfObjectsStr = getParameter("numberOfObjects");
        if (numberOfObjectsStr != null) {
            numberOfObjects = Integer.parseInt(numberOfObjectsStr);
        }
    }

    public void paint(Graphics g) {
        for (int i = 0; i < numberOfObjects; i++) {
            g.drawString("The Object is " + (i + 1), 20, 20 * (i + 1));
        }
    }
}
