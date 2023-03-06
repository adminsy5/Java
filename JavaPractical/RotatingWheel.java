/*
<applet code="RotatingWheel.java" height=400 width=400></applet>
*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class RotatingWheel extends Applet implements ActionListener {
   private int x, y, radius;
   private int angle;
   private boolean rotate;
   private Button start, stop;  
  
   public void init() {
      x = 150;
      y = 150;
      radius = 100;
      angle = 0;
      rotate = false;
      start = new Button("Start");
      stop = new Button("Stop");
      add(start);
      add(stop);
      start.addActionListener(this);
      stop.addActionListener(this);
   }
  
   public void paint(Graphics g) {
      g.setColor(Color.RED);
      g.fillArc(x-radius, y-radius, radius*2, radius*2, angle, 45);
      g.fillArc(x-radius, y-radius, radius*2, radius*2, angle+90, 45);
      g.fillArc(x-radius, y-radius, radius*2, radius*2, angle+180, 45);
      g.fillArc(x-radius, y-radius, radius*2, radius*2, angle+270, 45);
   }
  
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == start) {
         rotate = true;
      } else if (e.getSource() == stop) {
         rotate = false;
      }
   }
  
   public void start() {
      while(true) {
         repaint();
         if(rotate) {
            angle += 5;
         }
         try {
            Thread.sleep(100);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
} 
