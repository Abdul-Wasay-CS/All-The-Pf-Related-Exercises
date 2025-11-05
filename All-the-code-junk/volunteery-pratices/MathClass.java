import java.util.Scanner;

public class MathClass
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the volunteer number: ");
		double number = console.nextDouble();

		System.out.printf("\nAbsolute : %.2f",Math.abs(number));
		System.out.printf("\nSquare : %.2f",Math.pow(number,2));
		System.out.printf("\nSquare root : %.3f",Math.sqrt(number));
		System.out.printf("\nCeiling : %.2f",Math.ceil(number));
		System.out.printf("\nFloored : %.2f",Math.floor(number));
		System.out.printf("\nRounded : %d",Math.round(number));
		System.out.printf("\nRandom * input : %.2f",Math.random()*number);
	}// end of main method
}// end of class    