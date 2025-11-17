import java.util.Scanner;

public class Task1
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int[] reviews = new int[10];
		input(reviews);

		int avgReview = findAvg(reviews);

		displayPollResult(avgReview);
	}//main
	public static void input(int reviews[])
	{
		for(int i=0; i< reviews.length; i++)
		{
			do
			{
				System.out.println("Enter the review (1-10) of student no "+ (i+1));
				reviews[i] = input.nextInt();
				if(!(reviews[i]>0 && reviews[i]<=10))
					System.out.println("invaild review, pls carefully read the review range.");
			}while(!(reviews[i]>0 && reviews[i]<=10));
		}
	}//input

	public static int findAvg(int reviews[])
	{
		int sum=0;

		for(int i=0; i< reviews.length; i++)
		{
			sum += reviews[i];
		}	

		return sum/10;
	}//findAvg

	public static void displayPollResult(int avgReview)
	{
		if(avgReview > 5)
			System.out.println("The reviews were mostly positive");
		else
			System.out.println("The reviews were mostly negative");
	}
}//class