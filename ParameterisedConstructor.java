//programme of parameterised  Constructor

class ParameterisedConstructor
{
	int a,b;
	ParameterisedConstructor(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void Display()
	{
		System.out.println("\nA:"+a+"\nB:"+b+"\n");
	}
	public static void main(String args[])
	{
		ParameterisedConstructor obj1 = new ParameterisedConstructor(20,10);
		obj1.Display();
	}
}