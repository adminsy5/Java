import java.awt.*;
import java.util.*;
import java.applet.*;
 /*<applet code="Ex_repaint" width=350 height=150> </applet>*/
public class Ex_repaint extends java.applet.Applet
{
int debt = 683;
int totalTime = 1;
public void paint(Graphics g)
{
g.drawString(totalTime + " second's worth of debt is $" + (debt * totalTime), 5, 30);
for (int i = 0; i < 25000; i++)
totalTime++;
repaint();//calls paint() again
}
}