import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SunsetApplet extends JApplet {
    // size of the applet window
    private final int MAX_WIDTH = 500;
    private final int MAX_HEIGHT = 400;
    private final int HORIZON = 300;

    // timer
    private final int DELAY = 50;
    private Timer timer;

    // background color in applet panel
    private Color backColor;
    // color of the sea
    private Color seaColor;

    // rgb values for backColor
    private float r, g, b, alpha;

    // used in setting value for r
    private double time;

    // Y Coordinate of the top of the sun
    private int yCoord;

    private int seaBlue;
    private int seaGreen;
    private int numCalls;

    /**
     * Called by the browser or applet viewer to inform
     * this Applet that it has been loaded into the
     * system. It is always called before the first
     * time that the start method is called.
     */
    public void init() {
        timer = new Timer(DELAY, null);
        timer.addActionListener(new MyTimerListener());
        b = 1.0f;
        r = 0.5f;
        g = 0.0f;
        yCoord = 20;
        time = 0;
        numCalls = 0;
        backColor = new Color(r, g, b);
        seaBlue = 155;
        seaGreen = 100;
        seaColor = new Color(0, seaGreen, seaBlue);
        numCalls = 0;
    }

    /**
     * Starts the animation when the applet is started.
     * Called after init.
     */
    public void start() {
        timer.start();
    }

    /**
     * Stops the animation when the applet is stopped.
     */
    public void stop() {
        timer.stop();
    }

    /**
     * Here, the drawing of the applet gets done.
     * Shows the sun setting.
     * 
     * @param g the Graphics object for this applet
     */
    public void paint(Graphics g) {
        g.setColor(backColor);
        g.fillRect(0, 0, MAX_WIDTH, HORIZON);

        if (yCoord < HORIZON) {
            g.setColor(Color.yellow);
            g.fillOval(200, yCoord, 40, 40);
        }

        g.setColor(seaColor);
        g.fillRect(0, HORIZON, MAX_WIDTH, MAX_HEIGHT - HORIZON);
    }

    /**
     * An internal class to implement ActionListener.
     * It must be internal to have access to the class's variables
     * and repaint.
     */
    private class MyTimerListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            numCalls++;
            if (b > 0.003) {
                time += 0.002;
                r = (float) (0.5 * Math.sin(Math.PI * time));
                b -= 0.002;
                yCoord += 1;
            }
            if (numCalls % 4 == 0) {
                if (seaBlue > 0)
                    seaBlue--;
                if (seaGreen > 0)
                    seaGreen--;
            }
            seaColor = new Color(0, seaGreen, seaBlue);

            backColor = new Color(r, g, b);
            setBackground(backColor);
            repaint();
        }
    }
}
/*
 * <applet code=SunsetApplet.class height=500 width=500>
 * </applet>
 */