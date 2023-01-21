//print value <,>,=
import java.util.Scanner;
class data{
		
	public static void main(String args[])
	{
	Scanner userInput= new Scanner(System.in);
	System.out.println("Enter a :");
	int a=userInput.nextInt();
	
	System.out.println("Enter b :");
	int b=userInput.nextInt();

	//int a=20,b=22;
	if (a > b)
		System.out.println("A grater than B");
	else if  (a==b)
		System.out.println("A euals B");
	else 
		System.out.println("B grater than A");

	}
}
		