import java.util.Scanner;

public class QuadraticFormula
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		
		// note: print used instead of println because println asks for value in one line and 
		// then takes the value in the next line, thus making the format look ugly

		System.out.print("Enter the value of a, b, c : ");  	// asking user for value of a,b, and c
		double a = console.nextDouble();				// takes value from the user and puts it in a
		double b = console.nextDouble();			   	// takes value from the user and puts it in b
		double c = console.nextDouble();				// takes value from the user and puts it in c

		// parenthesis in this program have been used solely mostly to improve readibitly.

		double disc = (b*b) - (4 * a * c);				// can also be written as pow(b,2) - (4*a*c);

		if(disc > 0)
		{

			// sqrt used becuase manual says "can" , which indicates choice, and because sqrt looks more clear. 

			double firstRoot = ( (-1*b) + Math.sqrt(disc) ) / (2 * a); 
			double secondRoot = ( (-1*b) - Math.sqrt(disc) ) / (2 * a);	
			System.out.printf("\nThe eqaution has two roots %.6f and %.6f ",firstRoot,secondRoot);

		}	
		else if(disc == 0) 
		{
			
			double root =  ( (-1*b) + Math.sqrt(disc) ) / (2 * a);	
			System.out.printf("\nThe eqaution has one root %.6f",root);

		}
		else
		{

			System.out.println("\nThe eqaution has no real roots.");

		} // end of if else if block


	}//end of method main
}// end of class