 /*<applet code=RepaintApplet3 width=350 height=150> </applet>*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class RepaintApplet3 extends Applet {
   int mouseX = -10;
   int  mouseY = -10; 

    public void init() {
	addMouseMotionListener(new HandleMouseMotion());
	setBackground(Color.yellow);
    }
    
    class HandleMouseMotion extends MouseMotionAdapter {
       public void mouseDragged(MouseEvent e) {
	 mouseX = e.getX();
         mouseY = e.getY();
         repaint();   // This is a right approach: calls repaint()
                      // instead of paint() or update()
	}
    }
    
    public void update(Graphics g) {  
	paint(g);
    }   

    public void paint(Graphics g) {
	g.setColor(Color.red); 
	g.fillOval(mouseX-10, mouseY-10, 20, 20);
    }	
}
