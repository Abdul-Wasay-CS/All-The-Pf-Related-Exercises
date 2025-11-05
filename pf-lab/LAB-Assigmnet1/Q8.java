import java.util.Scanner;

public class Q8
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an alphabet character: ");
		char alphabet = input.next().charAt(0);

		if( (alphabet >='A' && alphabet <= 'Z') || (alphabet >= 'a' && alphabet <= 'z') )
		{
			switch(alphabet)
			{
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':	
				case 'o':	
				case 'O':	
				case 'u':
				case 'U':
					System.out.println("The entered character is a vowel.");
					break;
				default:
					System.out.println("The enterd character is a consonant");	
			}//end of switch
		}//end of if
		else
		{
			System.out.println("Invalid input!!");
		}//end of else
	}//end of method main
}//end of class