import java.util.Scanner;
class SumOfDigit
{
	public static void main(String args[])	
	{
		Scanner UserInput=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int digit = UserInput.nextInt();
		System.out.println("The Sum Is Given Numbers : "+SumDigits(digit));
	}
	
	public static int SumDigits(long n)
	{
		int result=0;
		while (n>0)
		{
			result+=n%10;
			n/=10;
		}
		return result;
	}
}
