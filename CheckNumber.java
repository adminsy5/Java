import java.util.Scanner;
class CheckNumber
{
	public static void main(String args[])
	{
		Scanner UserInput = new Scanner(System.in);
		System.out.println("Enter the number : ");
	int n = UserInput.nextInt();
		if(n%2 == 0)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
	}
}