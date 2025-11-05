import java.util.Scanner;

public class Task1b
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);

		int A,B;

		System.out.println("Enter two numbers: ");
		A = input.nextInt();
		B = input.nextInt();

		int smaller = Math.min(A,B);	
		int bigger= Math.max(A,B);

		for(int i = smaller; i<= bigger; i++)
		{
			System.out.print(i +",");
		}

		
	}
}