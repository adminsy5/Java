import java.lang.Thread;
class callme
{
synchronized void call(String msg)
{
System.out.println("["+msg);
try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println("Interrupted:");
}
System.out.println("]");

}
}
class demo implements Runnable
{
String msg;
callme trgt;
Thread t;
public demo(callme targ,String s)
{
trgt=targ;
msg=s;
t=new Thread(this);
t.start();
}
public void run()
{
trgt.call(msg);
}
}// class demo
class synchro 
{
public static void main(String a[])
{
callme target = new callme();
demo d1 = new demo(target,"Hello");
demo d2 = new demo(target,"Synchronized");
demo d3 = new demo(target,"World");
try
{
d1.t.join();
d2.t.join();
d3.t.join();
}
catch(InterruptedException e)
{
System.out.println("Interrupted");
}//catch
}//psvm
};
