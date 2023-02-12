import java.lang.Thread;
class demo implements Runnable
{
String name;
Thread t;
demo(String tname)
{
name=tname;
t = new Thread(this,name);
System.out.println("New Child thread"+t);
t.start();
}
public void run()
{
try{
for (int i =5;i>0;i--)
{
System.out.println(name+":"+i);
Thread.sleep(1000);
}
 }//try
catch(InterruptedException e)
 {
System.out.println(name+"Interrupted");
 }//catch
System.out.println(name+" Exiting");

}
};
class mrdemo
{
public static void main(String a[])
{
new demo("one"); // demo d1 = new demo("one");
new demo("two"); // demo d2 = new demo("two");
new demo("three"); // demo d3 = new demo("three");
try
{
Thread.sleep(10000);
}//try
catch(InterruptedException e)
{
System.out.println("Main Interrupted");
}//catch
System.out.println("Main Exiting");
}
};