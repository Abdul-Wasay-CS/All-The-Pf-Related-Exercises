import java.util.Scanner;

public class MoreForLoopPractice
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Enter a number (1-31):");
		int day = console.nextInt();

		if(day >=1 && day <=31)
		{
			for(int i=1; i <=31; i++)
			{
				if(i == day)
				{
					System.out.printf("[%d] ",i);
				}
				else
				{
					System.out.printf("%d ",i);
				}
			}//end of for loop
		}//end of outer if 
		else
		{
			System.out.println("Invalid Input!!");
		}
	}//end of method main
}//end of class