import java.util.Scanner;

class ReverseString
{
	public static void main(String args[])
	{
		Scanner userInput=new Scanner(System.in);
		System.out.println("\nEnter the String Which You want to reverse : ");
		
		String str = userInput.nextLine();
		System.out.println("\nOriginal string : "+str);

		//reverse string
		StringBuilder revString = new StringBuilder(str);
		revString.reverse();

		//To save in any string and show it.
		String afterReverseString  = revString.toString();
		System.out.println("Reverse String : "+ afterReverseString+"\n");
	}
}