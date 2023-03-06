import java.applet.*;
import java.lang.Thread;
import java.awt.Graphics;
import java.awt.*;
/* <applet code = "sbanner.class" width = 300 height=100>
</applet> */
public class sbanner extends Applet implements Runnable{
String msg= "Banner Motion";
Thread t = null;
int state;
boolean stopF;
public void init()
{
	setBackground(Color.BLACK);
	setForeground(Color.PINK);
	stopF = false;
}//init
public void start()
{
	t=new Thread(this);
	t.start();
}//start
	public void run()
	{
	char c;
		for(; ;)
		{
			try
			{
			repaint();
			Thread.sleep(500);
			c=msg.charAt(0);
			msg=msg.substring(1,msg.length());
			msg+=c;
			//System.out.println(msg);
			if(stopF)
			 break;
			}
		catch(InterruptedException e)
		{}
		}//for
	}//run
	public void stop()
	{
		stopF=true;
		t=null;
	}//stop
	public void paint(Graphics g)
	{
	
	g.drawString(msg,50,20);
	showStatus("hello");
	}//paint
}//sbanner