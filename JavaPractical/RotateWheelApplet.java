import java.applet.Applet; 
import java.awt.Graphics;
import java.awt.Button; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
<applet code = "RotateWheelApplet.java" height=400 width=400>
</applet>
*/
public class RotateWheelApplet extends Applet implements ActionListener {
   private int rotateAngle;
   private Button startButton;
   private Button stopButton;
   // Initialize the applet
   public void init() {
      rotateAngle = 0;
      startButton = new Button("Start");
      stopButton = new Button("Stop");
      add(startButton);
      add(stopButton);
      // Register the action listener
      startButton.addActionListener(this);
      stopButton.addActionListener(this);
   }
   // Paint the applet
   public void paint(Graphics g) {
      g.drawArc(50, 50, 200, 200, 0, rotateAngle);
   }
   // Handle the action event
   public void actionPerformed(ActionEvent event) {
      if (event.getSource() == startButton) {
         for (int i = 0; i < 360; i++) {
            rotateAngle = (rotateAngle + 1) % 360;
            repaint();
            try {
               Thread.sleep(20);
            } catch(InterruptedException e) {
               e.printStackTrace();
            }
         }
      }
      else if (event.getSource() == stopButton) {
         rotateAngle = 0;
         repaint();
      }
   }
}
