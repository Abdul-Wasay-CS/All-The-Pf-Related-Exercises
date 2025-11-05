import java.util.*;

public class Task4
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.print("Enter the numbers of minutes passed since midnight: ");
		int N =console.nextInt();

		int hours = N/60;
		int minutes = N%60;

		System.out.print("\nThe time right now is "+hours+" "+minutes);

	}
}