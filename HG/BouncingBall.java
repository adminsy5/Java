// This java applet program will show 
// the bouncing balls
/*<applet code="BouncingBall" width=400 height=400 ></applet>*/
package Applet;

import java.applet.*;
import java.awt.*;

public class BouncingBall extends Applet implements Runnable {
  // x,y coordinates and radius of the circle.
  int x = 150, y = 50, r = 20;
  int dx = 11, dy = 7;

  // create thread.
  Thread t;
  boolean stopFlag;

  // Function to start thread.
  public void start() {
    t = new Thread(this);
    stopFlag = false;
    t.start();
  }

  // Draw a circle from its present position.
  public void paint(Graphics g) {
    g.setColor(Color.red);
    g.fillOval(x - r, y - r, r * 2, r * 2);
  }
  // function to move the image.
  public void run() {
    while (true) {
      if (stopFlag)
        break;
      // Bounce if we've hit an edge.
      if ((x - r + dx < 0) || (x + r + dx > bounds().width)) dx = -dx;
      if ((y - r + dy < 0) || (y + r + dy > bounds().height)) dy = -dy;
      // Move the circle.
      x += dx;
      y += dy;
      try {
        Thread.sleep(100);
      } catch (Exception e) {
        System.out.println(e);
      };
      // print circle again n again.
      repaint();
    }  }
  // function to stop printing.
  public void stop() {
    stopFlag = true;
    t = null;
  }
}
