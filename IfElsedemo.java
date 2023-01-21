import java.util.Scanner;
class IfElsedemo
{
	int rno;
	String name;
	double marks;
	
	//IfElsedemo(int r,String n,double m)
	//{	
		//r=rno;
		//n=name;
		//m=marks;
		//rno=r;
		//name=n;
		//marks=m;
	//}
	
	void display()
	{
		Scanner userInputInt= new Scanner(System.in);
		Scanner userInputString= new Scanner(System.in);
		Scanner userInputDouble= new Scanner(System.in);

		System.out.println("Enter Roll Number: ");
		int rno=userInputInt.nextInt();
		
		System.out.println("Enter Name: ");
		String name=userInputString.nextLine();

		System.out.println("Enter Marks: ");
		double marks=userInputDouble.nextDouble();
	
		System.out.println(" 	Rno    : "+rno);
		System.out.println(" 	Name   : "+name);
		System.out.println(" 	Marks  : "+marks);

		if (marks > 80)
			System.out.println(" ==> Very Good ");
		else
			System.out.println(" ==> Not Good "); 
	}
	
	public static void main(String args[])
	{	
		IfElsedemo ig=new IfElsedemo();
		ig.display();
	}
}