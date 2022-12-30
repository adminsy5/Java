import java.util.Scanner;
class ArithmeticOperation
{
	public static void main(String args[])
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println(" Enter the First number : ");
		int a= userInput.nextInt();

		System.out.println(" Enter the Second number : ");
		int b= userInput.nextInt();
		
		System.out.println("\nAddition : "+(a+b));
		System.out.println("Subtract : "+(a-b));
		System.out.println("Divide : "+(a/b));
		System.out.println("Multiply : "+(a*b));
		System.out.println("Remainder : "+(a%b)+"\n");
	}
}