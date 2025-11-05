import java.util.Scanner;

public class Task3
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of integers you want to input: ");
		int n = input.nextInt();
		int num,counter= 0;
		for(int i = 1 ; i <= n; i++)
		{
			System.out.println("Enter the "+i+" number:");
			num = input.nextInt();

			if(num == 0)
				counter++;

		}//end of for loop

		System.out.println("The amount of zeros entered is: "+counter);
	}
}