import java.util.*;

public class IfElse
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your marks( 0 - 100 ): ");
		int marks = console.nextInt();

	// checking if the given marks are within the requested contraints.

		if(marks >=0)
			if(marks >= 50)
				System.out.println("Pass!");
			else
				System.out.println("Fail!");
		else
			System.out.println("Invalid input!");
	}
}