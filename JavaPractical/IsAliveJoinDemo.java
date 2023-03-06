//isalive() and join() to wait for multiple threads to finish

class NT implements Runnable
{
	String tname; //name of thread
	Thread t;

	NT(String nm)
	{
		tname = nm;
		t = new Thread(this, tname);
		System.out.println("NT = " + t);
		t.start(); 
	}
	
	public void run()
	{
		try
		{
			for (int i = 1; i <= 5; i++)
			{
				System.out.println(tname + " = " + i);
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println(tname + " InterruptedException");
		}
		System.out.println(tname + " exit");
	}
}

class IsAliveJoinDemo
{
	public static void main(String args[])
	{
		NT ob1 = new NT("One");
		NT ob2 = new NT("Two");
		NT ob3 = new NT("Three");

		System.out.println("ob1.t.isAlive() = " + ob1.t.isAlive());
		System.out.println("ob2.t.isAlive() = " + ob2.t.isAlive());
		System.out.println("ob3.t.isAlive() = " + ob3.t.isAlive());
		// wait for threads to finish
		try
		{
			System.out.println("Waiting for threads to finish");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch (InterruptedException e)
		{
			System.out.println("Main InterruptedException");
		}

		System.out.println("ob1.t.isAlive() = " + ob1.t.isAlive());
		System.out.println("ob2.t.isAlive() = " + ob2.t.isAlive());
		System.out.println("ob3.t.isAlive() = " + ob3.t.isAlive());

		System.out.println("Main exit");
	}
}
