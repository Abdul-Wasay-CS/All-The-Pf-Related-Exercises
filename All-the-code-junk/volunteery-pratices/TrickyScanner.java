import java.util.*;

public class TrickyScanner
{
	public static void main(String [] args)
	{
		int age;
		String favQuote;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = console.nextInt();
		console.nextLine(); // consumes the new line buffer
		System.out.println("Enter your favorite quote: ");
		favQuote =  console.nextLine();

		System.out.printf("At %d years old, your favorite quote is: %s ",age,favQuote);

		console.close();

	}
}