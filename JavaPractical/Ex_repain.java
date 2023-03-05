import java.awt.*;
import java.util.*;
public class Ex_repaint extends java.applet.Applet
{
int debt = 683;
int totalTime = 1;
public void paint(Graphics g)
{
g.drawString(totalTime + " second's worth of debt is $" + (debt * totalTime), 5, 30);
for (int i = 0; i < 250000000; i++);
totalTime++;
repaint();//calls paint() again
}
}