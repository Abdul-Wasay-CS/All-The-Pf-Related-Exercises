import java.util.Scanner;

public class Question9
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Enter a three-digit intger:");
		int orginalNumber = console.nextInt();


		int tempNumber = orginalNumber;
		
		// extracting each digit.

		int d1 = tempNumber%10;
		tempNumber/=10;
		int d2 = tempNumber%10;
		tempNumber/=10;
		int d3 = tempNumber%10;
		tempNumber/=10;
		
		//puts the last digit in the place of last,

		int reverseNumber = d3*100 + d2*10 + d1;

		if(reverseNumber == orginalNumber)
			System.out.println(orginalNumber + " is a palindrome");
		else
			System.out.println(orginalNumber + " is not a palindrome");
		
	}//end of method main
}//end of class