import java.util.Scanner;

public class Task7
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
		int max = 0, num;
		int count = 0;
		while(true)
		{
			num = input.nextInt();

			if(num == 0)
				break;       

			if(num%2 == 0)
				count++;

		}

		System.out.println("The number of even numbers in the sequence is " + count);
	}//end of method main
}