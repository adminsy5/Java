import java.applet.*;
import java.awt.*;
 
 /* <applet code = "ball" width = 400 height = 200> </applet> */
public class ball extends Applet implements Runnable
 {
 Thread t;
 int x = 0;
 int y = 0;
 
public void start()
 {
 t = new Thread(this);
 t.start();
 }
 
public void paint(Graphics g)
   {
	g.setColor(Color.RED);
      g.fillOval(x,y,100,100);
    }
 
public void run()
 {
   try
      {
      for(;;)
       {
                for(;;)
            {
                 if(y == 120)
                     {
                      break;
                     }
    else if (x == 390)
        {
     x = 0;
     y = 0;
    repaint();
         }
             else
               {
                   y = y +3;
                   x = x +3;
                   Thread.sleep(100);
                 repaint();
               }
                }
           for(;;)
              {
               if(y==0)
                   {
                        break;
                        }
               else if (x == 390)
           {
          x = 0;
          y = 0;
                 repaint();
    }
    else
                 {
        y = y-3;
               x = x +3;
               Thread.sleep(100);
                repaint();
               }
                } 
            run();
       }
  }
 
catch(InterruptedException e)
    {
 
    }
 }
}