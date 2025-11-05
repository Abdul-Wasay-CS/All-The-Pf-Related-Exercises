import java.util.Scanner;

public class MyBelovedQuadraticFormula
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		
		// note: print used instead of println because println asks for value in one line and 
		// then takes the value in the next line, thus making the format look ugly

		System.out.print("Enter the value of a: ");  	// asking user for value of a
		double a = console.nextDouble();				// takes value from the user and puts it in a

		System.out.print("\nEnter the value of b: ");  	// asking user for value of b
		double b = console.nextDouble();			   	// takes value from the user and puts it in b

		System.out.print("\nEnter the value of c: "); 	// asking user for value of c
		double c = console.nextDouble();				// takes value from the user and puts it in b

		// parenthesis in this program have been used solely mostly to improve readibitly.

		double disc = (b*b) - (4 * a * c);				// can also be written as pow(b,2) - (4*a*c);

		if(disc > 0)
		{

			// sqrt used  because it looks more clear. 

			double firstRoot = ( (-1*b) + Math.sqrt(disc) ) / (2 * a); 
			double secondRoot = ( (-1*b) - Math.sqrt(disc) ) / (2 * a);	
			System.out.println("First root = " + firstRoot);
			System.out.println("Second root = " + secondRoot);

		}	
		else if(disc == 0) 
		{
			
			double root =  ( (-1*b) + Math.sqrt(disc) ) / (2 * a);	
			System.out.println("Root = " + root);

		}
		else
		{

			System.out.println("The eqaution has no real roots.");

		} // end of if else if block


	}//end of method main
}// end of class