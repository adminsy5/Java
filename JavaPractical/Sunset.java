/*
<applet code="Sunset.java" height=400 width=400></applet>
*/
import java.awt.*;
import java.applet.*;
public class Sunset extends Applet {
 
  public void paint(Graphics g) {
       
    // The sky
    g.setColor(Color.cyan);
    g.fillRect(0,0,400,200);
 
    // The sun
    g.setColor(Color.orange);
    g.fillOval(100,75,200,300);
 
    // The ground
    g.setColor(Color.green);
    g.fillRect(0,200,400,200);
  }
}