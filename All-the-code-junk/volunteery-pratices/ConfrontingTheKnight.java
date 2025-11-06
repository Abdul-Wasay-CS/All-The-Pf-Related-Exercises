import java.util.Scanner;

public class ConfrontingTheKnight{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException 
	{
		//varaible to enforce correct user name. which should be alphanumeric
		boolean userIsValid = true;
		String userName;
		do{
			System.out.println("Who is it that wanders these lands so blindly? ");
			Thread.sleep(2000);	
			System.out.println("Does Thy not Know that the hollow Knight Haunts these paths..");
			Thread.sleep(2000);
			System.out.println("What is the your Name O' traveler?");
			userName = input.nextLine();
			int nameLength = userName.length();
			
			//to validate username
			char currentChar;
			for(int i=0; i<nameLength; i++)
			{	
				currentChar = userName.charAt(i);
				if(!Character.isLetter())
				{
					userIsValid = false;
					break;
				}
			}

		}while(userIsValid);
	}	
}