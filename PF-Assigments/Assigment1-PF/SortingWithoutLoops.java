import java.util.Scanner;

public class SortingWithoutLoops
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		// used print to keep  formating consistent. 

		System.out.print("Enter three integers (seperated by spaces) :");
		int firstNumber = console.nextInt();
		int secondNumber= console.nextInt();
		int thirdNumber = console.nextInt();
			

		int max,middleNumber = 0,min;

		max = Math.max(firstNumber,Math.max(secondNumber,thirdNumber));
		min = Math.min(firstNumber,Math.min(secondNumber,thirdNumber));

		if( (max == firstNumber && min == secondNumber)	|| (max== secondNumber && min == firstNumber) )
			middleNumber = thirdNumber;
		else if( (max == firstNumber && min == thirdNumber) || (max == thirdNumber && min == firstNumber) ) 
			middleNumber = secondNumber;
		else if( ( max == secondNumber && min == thirdNumber ) || (max == thirdNumber && min == secondNumber) )
			middleNumber = firstNumber;

		System.out.printf("%d, %d, %d",min,middleNumber,max);


	

	}//end of m  ethod main
}//end of class