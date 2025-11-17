import java.util.Scanner;

public class Activity3
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char[] characters = new char[10];

		int counter = 0;

		for(int i=0; i<characters.length; i++)
		{
			System.out.print("a["+i+"] = ");
			characters[i] = input.next().charAt(0);
		}

		for(int i =0; i<characters.length; i++)
		{
			for(int j=0; j< characters.length; j++)
				if(characters[i] == characters[j])
					counter++;

			System.out.println(characters[i]+" occurs " + counter + " times");
			counter = 0;	
		}

	}
}