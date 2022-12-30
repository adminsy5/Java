import java.util.Scanner;
class PrintAsciiValue
{
	public static void main(String args[])
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter The Character : ");
		
		char Character = userInput.next().charAt(0);
		int AsciiValue = Character;
		System.out.println("Ascii value of "+Character+" is : "+AsciiValue);
	}
}