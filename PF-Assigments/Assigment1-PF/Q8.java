import java.util.Scanner;

public class Q8
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Enter the first 9 digits of you ISBN:");
		long nineDigitNumber = console.nextLong();

		int tempNumber = (int)nineDigitNumber;
		
		// extracting each digit
		// retreives the last digit ( in this case, 9th digit )
		// removes the last digit ( 9th digit ) from tempnumber
		
		int d9 = tempNumber%10; 	
		tempNumber /= 10;			
		int d8 = tempNumber % 10; 
		tempNumber /= 10;    	
		int d7 = tempNumber % 10;
		tempNumber /= 10;    	
		int d6 = tempNumber % 10; 
		tempNumber /= 10;    	
		int d5 = tempNumber % 10; 	
		tempNumber /= 10;    		
		int d4 = tempNumber % 10;
		tempNumber /= 10;    	
		int d3 = tempNumber % 10; 	
		tempNumber /= 10;    		
		int d2 = tempNumber % 10; 	
		tempNumber /= 10;    		
		int d1 = tempNumber % 10; 	
		tempNumber /= 10;    		
		
		// calculates the checksum
		
		int d10 = ( d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9 )%11;

		// checking if the checksum is equal to 10, if it isnt , simply put the last digit with the rest of the number.
		// this switch works like an if else statement in this case, but its more easy to handle.So it's preferred.

		switch(d10)
		{
			case 10:
				 // concatinates the character "X" to the end of the nineDigitNumber. and saves it in tenDigitNumber
				System.out.println("The ISBN-10 number is "+nineDigitNumber+"X");
				break;
			default:
				//Simply joins the last number to the rest of the number.
				//here multiplying the nine digit number with 10 makes  the last digit as 0,
				//hence when a one digit number is further added, it comes as the tenth place digit.
				long tenDigitNumber = (nineDigitNumber*10)+d10;
				System.out.println("The ISBN-10 number is "+tenDigitNumber);

		}// end of switch statement
	}//end of method main
}//end of class