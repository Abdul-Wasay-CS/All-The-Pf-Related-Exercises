public class Activity3
{
	public static void main(String [] args)
	{
		double monthlyPay = 6000.0;
		double contribution;
		// caculates and displays a 5% contribution.
		contribution = monthlyPay * 0.05;
		System.out.printf("\n5 percent is $%.2f per month.",contribution);
		// caculates and displays a 8% contribution.
		contribution = monthlyPay * 0.08;
		System.out.printf("\n8 percent is $%.2f per month.",contribution);
		// caculates and displays a 10% contribution.
		contribution = monthlyPay * 0.10;
		System.out.printf("\n10 percent is $%.2f per month.",contribution);
		
	}
}