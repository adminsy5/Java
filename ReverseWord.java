import java.util.Scanner;
class ReverseWord
{
	public static void main(String args[])
	{
		Scanner userInput = new Scanner ( System.in );
		System.out.println("Enter the word : ");
		
		String NewWord = userInput.nextLine();
		System.out.println("\nOriginal Word : "+NewWord);
		
		StringBuilder ReverseWord = new StringBuilder(NewWord);
		ReverseWord.reverse();
		
		String AfterReverseWord = ReverseWord.toString();
		System.out.println("\nReverse word : "+AfterReverseWord+"\n");
	}
}