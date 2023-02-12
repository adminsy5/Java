public class demo extends Thread
{
public static void main(String args[])
{
int hh,mm,ss;
try
{
Thread t=new Thread("demo");
for(hh=0;hh<24;hh++)
{
for(mm=0;mm<=59;mm++)
{
for(ss=0;ss<=59;ss++)
{
System.out.println(hh+":"+mm+":"+ss);
t.sleep(2000);
}//ss
}//mm

}//hh
}//try
catch(Exception e)
{
System.out.println("Error:" + e);
}//catch
}//main
}//class