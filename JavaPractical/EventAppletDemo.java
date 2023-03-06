/*<applet code=EventAppletDemo width=300 height=300></applet>*/
import java.applet.*;  
import java.awt.*;  
import java.awt.event.*;  
public class EventAppletDemo extends Applet implements ActionListener
{  
  Button b1;  
  TextField tf1;  
  public void init()
  {  
    tf1=new TextField();  
    tf1.setBounds(30,40,200,20);  
    b1=new Button("Click");  
    b1.setBounds(80,150,60,50);    
    add(b1);
    add(tf1);  
    b1.addActionListener(this);  
    setLayout(null);  
  }  
  public void actionPerformed(ActionEvent e)
  {  
    tf1.setText("Welcome to studytonight");  
  }   
}
  