import java.awt.*;
import java.applet.*;
/*<applet code="movingBall" height=800 width=400></applet>*/
public class movingBall extends Applet implements Runnable
{
  Thread t;
  int i=0;
  public void init()
  {
   t=new Thread(this,"ball");
   t.start();
   }
  public void paint(Graphics g)
  {
    g.setColor(Color.red);
    g.fillOval(0,0+i*10,70,70);

  }
  public void run()
  {
   try{
      for(;;)
      {
       for(i=0;i<50;i++)
       {
        repaint();
        Thread.sleep(100);
       }
       for(i=50;i>0;i--)
       {repaint();
        Thread.sleep(100);}
      } 
      }
       catch(InterruptedException e)
      {System.out.println(e.toString());}
  }
} 