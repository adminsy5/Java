//Evening handling in an applet 

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code=Applet31 width=400 height=400></applet>

*/

public class Applet31 extends Applet implements ActionListener
{
Label label1, label2, label3; 
TextField tf1, tf2, tf3;
Button b1, b2, b3, b4;
String whichButtonClk;	//This String object will tells us which button is pressed

public void init()
{
System.out.println("Initializing an applet");

label1 = new Label("Number1");
tf1= new TextField(10);

label2 = new Label("Number2");
tf2= new TextField(10);

b1 = new Button("Add");
b2= new Button("Subtract");
b3 = new Button("Multiply");
b4= new Button("Divide");


add(label1);
add(tf1);

add(label2);
add(tf2);

add(b1);
add(b2);
add(b3);
add(b4);
tf1.addActionListener(this); 	//Applet5 class registering to listen to first textfield event
tf2.addActionListener(this); 	//Applet5 class registering to listen to second textfield event
b1.addActionListener(this);	//Applet5 class registering to listen to first button event
b2.addActionListener(this);	//Applet5 class registering to listen to second button event
b3.addActionListener(this);	//Applet5 class registering to listen to third button event
b4.addActionListener(this);	//Applet5 class registering to listen to fourth button event

}


public void actionPerformed(ActionEvent ae) 
{
if(ae.getActionCommand().equals("Add") || ae.getActionCommand().equals("Subtract") ||ae.getActionCommand().equals("Multiply") ||ae.getActionCommand().equals("Divide"))// checking if an event of clicking the add/subtract/multiply/divide button is generated
{
whichButtonClk=ae.getActionCommand(); //initializing whichButtonClk to a String value of Button which is clicked
repaint();
}
}

public void paint(Graphics g)
{	
g.drawString("Please enter two numbers to perform math operations", 10,130);

if(tf1.getText().equals("") && tf2.getText().equals("")) 
//if the add button is clicked when textfields are empty
{	
}	
else
{
	Integer i1=  new Integer(tf1.getText());
	Integer i2= new Integer(tf2.getText());	
	int sum = i1+i2;
	int subtract=i1-i2;
	int multiply=i1*i2;
	float divide=(float)i1/(float)i2; 
//Casting int to float, to get precise division of two values in float
	
	if(whichButtonClk.equals("Add"))
		g.drawString("Your sum is "+ sum, 10,190);
	if(whichButtonClk.equals("Subtract"))
		g.drawString("Your subtract is "+ subtract, 10,190);
	if(whichButtonClk.equals("Multiply"))
		g.drawString("Your multiply is "+ multiply, 10,190);
	if(whichButtonClk.equals("Divide"))
		g.drawString("Your divide is "+ divide, 10,190);
}
}
}