/*
<applet code="DigitalClock.java" height=400 width=400></applet>
*/

import java.applet.*;
import java.awt.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DigitalClock extends Applet implements Runnable{
    Thread t = null;
    SimpleDateFormat clock = new SimpleDateFormat("HH:mm:ss");
    int hour,min,sec;
    String timeString = "";
    Font f = new Font("Arial",Font.PLAIN,40);
    Color c;
    
    public void init(){
        setBackground(Color.white);
    }
    
    public void start(){
        t = new Thread(this);
        t.start();
    }
    
    public void run(){
        try{
            while(true){
                java.util.Calendar cal = java.util.Calendar.getInstance();
                hour = cal.get(cal.HOUR_OF_DAY);
                if(hour >12)
                    hour -= 12;
                min = cal.get(cal.MINUTE);
                sec = cal.get(cal.SECOND);
                SimpleDateFormat clock = new SimpleDateFormat("hh:mm:ss");
                Date date = cal.getTime();
                timeString = clock.format(date);
                repaint();
                t.sleep(1000);
            }
        }
        catch (Exception e){}
    }
    
    public void paint(Graphics g){
        g.setFont(f);
        g.setColor(c);
        g.drawString(timeString,50,50);
    }
    
    public void changeColor(Color ch){
        c = ch;
    }
}
