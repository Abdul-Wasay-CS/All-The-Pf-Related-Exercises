import java.util.Scanner;

public class ConfrontingTheKnight{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException 
	{
		//varaible to enforce correct user name. which should be alphanumeric
		boolean userIsNotValid;
		String userName;
			
			System.out.println("𝄫      An Old Man Appears with a Big White Beard, And a long Crutch      𝄫");
			System.out.println("▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁");
			Thread.sleep(1500);
			System.out.println("Old Man 🎅:  Does Thy not Know that the hollow Knight Haunts these paths..");;
			Thread.sleep(1500);	
			System.out.println("Old Man 🎅:  What is the Name of Thy who wanders these lands so blindly? ");
		do{	
			//validates username
			userIsNotValid= false;
			userName = input.nextLine();
			int nameLength = userName.length();
			char currentChar;
			for(int i=0; i<nameLength; i++)
			{	
				currentChar = userName.charAt(i);
				if(!(Character.isLetter(currentChar) ||Character.isDigit(currentChar)||Character.isWhitespace(currentChar)))
				{	
					System.out.println("You think of me a fool? tell your Actual Name!!");
					userIsNotValid = true;
					break;
				}
			}

		}while(userIsNotValid);

		System.out.println("Welcome then, "+userName);
	}	
}