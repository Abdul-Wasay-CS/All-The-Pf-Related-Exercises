import java.util.Scanner;

public class Activity7
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		System.out.printf("%30s","Multiplication Table\n");

		System.out.print("    ");

		for (int j = 1; j <= 9; j++) 
		{
			System.out.print("   "+ j);
		}
		System.out.println("\n__________________________________________");

		for (int i = 1; i<=9; i++)
		{
			System.out.print(i + " | ");	
			for (int j = 1; j <= 9 ; j++) 
			{
				System.out.printf("%4d",i*j);	
			}
			System.out.println();
		}
	}
}