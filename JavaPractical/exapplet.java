/* This Applet sets the foreground and background colors 
and out puts a string. */
import java.awt.*;
import java.applet.*;
//Also watch command line for messages
/*<applet code="exapplet" width=600 height=40>
</applet>
*/
public class exapplet extends Applet {
String msg;
// set the foreground and background colors.
public void init()
{
setBackground(Color.cyan);
setForeground(Color.red);
msg = "Initialised --";
}
// Add to the string to be displayed.
public void start()
{
msg += " Starting --";
}
// Display the msg in the applet window.
public void paint(Graphics g)
{ msg += " Painting.";
g.drawString(msg, 10, 30);
}
}