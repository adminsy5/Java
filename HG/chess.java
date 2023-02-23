/*<applet code=chess height=400 width=700></applet>*/
import java.awt.*;
import java.applet.*;
  
// Extends Applet Class
public class chess extends Applet {
  
    static int N = 40;
  
    // Use paint() method
    public void paint(Graphics g)
    {
        int x, y;
        for (int row = 0; row < N; row++) {
  
            for (int col = 0; col < N; col++) {
  
                // Set x coordinates of rectangle
                // by 20 times
                x = row * 20;
  
                // Set y coordinates of rectangle
                // by 20 times
                y = col * 20;
  
                // Check whether row and column
                // are in even position
                // If it is true set Black color
                if ((row % 2 == 0) == (col % 2 == 0))
                    g.setColor(Color.BLACK);
                else
                    g.setColor(Color.WHITE);
  
                // Create a rectangle with
                // length and breadth of 20
                g.fillRect(x, y, 20, 20);
            }
        }
    }
}