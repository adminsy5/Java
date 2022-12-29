//Programme of Multilevel Inheritance
class First
{
	int a=10;
	void DisplayA()
	{
		System.out.println("\nA : "+a);
	}
}
class Second extends First
{
	int b;
	Second()
	{
		b=20;
	}
	void DisplayB()
	{
		System.out.println("B : "+b);
	}
}
class Third extends Second 
{
	int c=30;
	void DisplayC()
	{
		System.out.println("C : "+c);
	}
}
class MultilevelInheritance extends Third
{
	void Sum()
	{
		System.out.println("\nA + B + C = "+(a+b+c)+"\n");
	}
	public static void main(String args[])
	{
		MultilevelInheritance obj1= new MultilevelInheritance();
		obj1.DisplayA();
		obj1.DisplayB();
		obj1.DisplayC();
		obj1.Sum();
	}
} 
	
