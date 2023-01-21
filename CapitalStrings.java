import java.util.*;
class CapitalStrings
{
	public static void main(String args[])
	{
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter the sentence : ");

		String UpperCaseFirstLetter = userInput.nextLine();
		String upper_case_line="";
	
		Scanner LineScan = new Scanner(UpperCaseFirstLetter);
		while(LineScan.hasNext())
		{
			String word = LineScan.next();
			upper_case_line+= Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		System.out.println(upper_case_line.trim());
	}
}