import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code=AppletWheelRotation.class width=1000 height=500></applet>*/
public class AppletWheelRotation extends Applet implements ActionListener, Runnable {
    private Thread thread;
    private boolean isRunning;
    private Button startButton, stopButton;
    private int angle = 0;

    public void init() {
        startButton = new Button("Start");
        stopButton = new Button("Stop");
        add(startButton);
        add(stopButton);
        startButton.addActionListener(this);
        stopButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (!isRunning) {
                isRunning = true;
                thread = new Thread(this);
                thread.start();
            }
        } else if (e.getSource() == stopButton) {
            isRunning = false;
            thread = null;
        }
    }

    public void run() {
        while (isRunning) {
            angle = (angle + 5) % 360;
            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
    }

    public void paint(Graphics g) {
        int width = getSize().width;
        int height = getSize().height;
        int centerX = width / 2;
        int centerY = height / 2;
        int radius = Math.min(width, height) / 2 - 50;
        g.setColor(Color.white);
        g.fillRect(0, 0, width, height);
        g.setColor(Color.cyan);
        g.fillArc(centerX - radius, centerY - radius, radius * 2, radius * 2, angle, 120);
        g.setColor(Color.yellow);
        g.fillArc(centerX - radius, centerY - radius, radius * 2, radius * 2, angle + 120, 120);
        g.setColor(Color.pink);
        g.fillArc(centerX - radius, centerY - radius, radius * 2, radius * 2, angle + 240, 120);
    }
}