/*
<applet code="SmileyFace.java" height=400 width=400></applet>
*/

import java.applet.Applet;
import java.awt.*;

public class SmileyFace extends Applet
{
    public void paint (Graphics g)
    {
        g.setColor (Color.yellow); // set color to yellow
        g.fillOval (50, 50, 200, 200); // draw face
        g.setColor (Color.black); // set color to black
        g.fillOval (90, 100, 20, 20); // draw left eye
        g.fillOval (190, 100, 20, 20); // draw right eye
        g.drawArc (80, 140, 140, 70, 0, -180); // draw smile
    }
}