//Programme of Single Inheritance

class First
{
	int a=20;
}
class Second extends First
{
	int b=20;
	void Display()
	{
		System.out.println("\nSum Of A+B = "+(a+b)+"\n");
	}
}
class SingleInheritance extends Second
{
	public static void main(String[] args)
	{
		SingleInheritance dc=new SingleInheritance();
		dc.Display();
	}
}
