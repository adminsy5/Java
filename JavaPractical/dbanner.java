import java.awt.*;
import java.io.*;
import java.applet.*;
import java.lang.Thread;
/* <applet code = dbanner width = 300 height=100></applet> */
public class dbanner extends Applet implements Runnable{
Thread t = null;
boolean stopF;
int width, height;
int x, y;
public void init()
{
width = getSize().width;
height = getSize().height;
setBackground( Color.yellow);
x = width/2 - 20;
y = height/2 - 20;
stopF = false;
}//init
public void start()
{
t=new Thread(this);
t.start();
}//start
public void run()
{
for(; ;)
{
try
{
Thread.sleep(250);
repaint();
x=x-1;
if(stopF)
break;
}
catch(InterruptedException e)
{}
}//for
}//run
public void paint(Graphics g)
{
setForeground( Color.red );
g.drawRect( x, y, 180, 40 );
g.drawString("  JAVA by JAMES GOSLING",x+5,y+25);
showStatus("hello");
}//paint
public void stop()
{
stopF=true;
t=null;
}//stop
}//class