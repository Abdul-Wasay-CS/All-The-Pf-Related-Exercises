import java.util.Scanner;

public class Task1
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		int A,B;

		System.out.println("Enter two numbers: ");
		A = input.nextInt();
		B = input.nextInt();

		for (int i=A; i<=B; i++) 
		{
			System.out.print(i+  ",");	
		}

	}
}