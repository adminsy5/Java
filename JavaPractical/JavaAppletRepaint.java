import java.applet.Applet;
import java.awt.Graphics;
/*<applet code=JavaAppletRepaint width=400 height=400></applet>*/

public class JavaAppletRepaint extends Applet {
 
    int i;
 
    public void paint(Graphics g)
    {
        g.drawString("i = "+i, 100, 100);
     
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ex){}
     
        i++;
        repaint();
    }
}