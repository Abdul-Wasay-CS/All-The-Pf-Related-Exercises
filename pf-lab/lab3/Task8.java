import java.util.*;

public class Task8
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.print("Enter a number between 0 - 1000: ");
		int orgNum= console.nextInt();

		int firstDigit = orgNum% 10;  // puts the last digit in firstDigit
		int newNum =  orgNum / 10; // removes the last digits from the orginal number
		int secondDigit = newNum % 10; // puts the  second last digit  in secondDigit.
		newNum = newNum / 10;	// removes the second last digtit from newNum
		int thirdDigit = newNum % 10; // puts the third last digit in thirdDigit/ 
		newNum = newNum / 10;		// removes the third last digit from newNum.
		int fourthDigit = newNum % 10;

		int digitSum = firstDigit + secondDigit + thirdDigit + fourthDigit;

		System.out.print("\nThe sum of digits of  the given number is "+ digitSum);
				
	}
}