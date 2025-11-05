import java.util.Scanner;

public class NestedIfs
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.print("Enter your Fsc percentage: ");
		double percentage = console.nextDouble();

		if(percentage >=50)
			if(percentage >= 60)
				if(percentage >= 70)
					if(percentage>=85)
						System.out.println("\nYou have gotten admission in Computer Science");//  transaltes to the body of if(percentage >= 85)
					else
						System.out.println("\nYou have gotten admission in engineering"); //  transaltes to the body of if(percentage >=70 && percentage <85)
				else
					System.out.println("\nYou have gotten admissioni in Buisness!");	//  transaltes to the body of if(percentage >=60 && percentage <70)
			else
				System.out.println("\nYou have gotten admission in Arts!");	//  transaltes to the body of if(percentage >=50 && percentage <60)
		else 
			System.out.println("\nYou are not eligible for admission!");//  transaltes to the body of if(percentage < 50 )
	} // End of main method
}	// end of class