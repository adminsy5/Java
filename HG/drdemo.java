class demo implements Runnable
{
demo()
{
Thread t = new Thread(this,"demo thread"); 
System.out.println("Child thread"+t);
t.start(); 
}
public void run()
{
try{
for (int i =5;i>0;i--)
{
System.out.println("child thread:"+i);
Thread.sleep(500);
}
 }//try
catch(InterruptedException e)
 {
System.out.println("Child Interrupted");
 }//catch
System.out.println("Exit from child");
}

};
class drdemo
{
public static void main(String a[])
{
demo d = new demo();// call to constructor.
//or
//new demo();// call to constructor.
try
{
for (int i =5;i>0;i--)
{
System.out.println("Main thread:"+i);
Thread.sleep(1000);
}
}//try
catch(InterruptedException e)
{
System.out.println("Main Interrupted");
}//catch
System.out.println("Exit from main");
}
};