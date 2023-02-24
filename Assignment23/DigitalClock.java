import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/*<applet code="DigitalClock" height=300 width=500></applet>*/
public class DigitalClock extends JApplet implements Runnable {
    private Thread thread;
    private Calendar calendar;
    private JLabel timeLabel;
    private JComboBox<String> colorComboBox;

    public void init() {
        Container content = getContentPane();
        content.setLayout(new FlowLayout());
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("SansSerif", Font.BOLD, 48));
        content.add(timeLabel);
        colorComboBox = new JComboBox<>(new String[] { "Black", "Cyan",
                "Orange", "Gray" });
        colorComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String color = (String) colorComboBox.getSelectedItem();
                switch (color) {
                    case "Black":
                        timeLabel.setForeground(Color.BLACK);
                        break;
                    case "Cyan":
                        timeLabel.setForeground(Color.CYAN);
                        break;
                    case "Orange":
                        timeLabel.setForeground(Color.ORANGE);
                        break;
                    case "Gray":
                        timeLabel.setForeground(Color.GRAY);
                        break;
                }
            }
        });
        content.add(colorComboBox);
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    public void run() {
        while (thread != null) {
            calendar = Calendar.getInstance();
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            int minute = calendar.get(Calendar.MINUTE);
            int second = calendar.get(Calendar.SECOND);
            timeLabel.setText(String.format("%02d:%02d:%02d", hour,
                    minute, second));
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        thread = null;
    }
}