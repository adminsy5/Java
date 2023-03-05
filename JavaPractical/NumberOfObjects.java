/*
<applet code="NumberOfObjects.java" width="300" height="300">
</applet>
*/

import java.awt.*;
import javax.swing.*;

public class NumberOfObjects extends JApplet {

    public void init() {
        String s = getParameter("number");
        int number = Integer.parseInt(s);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        for (int i = 0; i < number; i++) {
            Color color = new Color((int)(Math.random() * 0x1000000));
            contentPane.add(new ShapePanel(color));
        }
    }
}

class ShapePanel extends JPanel {
    Color color;

    public ShapePanel(Color c) {
        color = c;
        setPreferredSize(new Dimension(30, 30));
    }

    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}