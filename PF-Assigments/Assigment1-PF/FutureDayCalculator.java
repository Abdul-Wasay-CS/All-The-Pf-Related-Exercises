import java.util.Scanner;

public class FutureDayCalculator
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		// Gives a nice little menu explaining how a the Days are numbered.
		
		System.out.println("\n0.Sunday\n1.Monday\n2.Tuesday\n3.Wedensday\n4.Thursday\n5.Friday\n6.Saturday");
		
		// Takes Today number from the user and puts it in currentDay

		System.out.print("\nEnter the Today's number:");
		int currentDayNumber = console.nextInt();
		
		// Takes the number of days elapsed.
		System.out.print("Enter teh number of days elapsed since today: ");
		int daysElapsedNumber = console.nextInt();

		if(currentDayNumber>= 0 && currentDayNumber <7)
			{
				if(daysElapsedNumber>=0)
				{
					// calculates the future day number and takes out the week part of it , 
					// and store the remmainder (future Day Number) in futureDayNumber.

					int futureDayNumber = ( currentDayNumber + daysElapsedNumber ) % 7;

					// had to intialize these to emptu string , else the compiler threw an error, 
					// saying that the var's might not be intialized ( probably because intialization is in a switch statement)


					String currentDay=" ",futureDay= " ";

					// converts the current day number to its respective day name.

					switch(currentDayNumber)
					{
						case 0:
							currentDay = "Sunday";
							break;
						case 1:
							currentDay = "Monday";
							break;
						case 2:
							currentDay = "Tuesday";
							break;
						case 3:
							currentDay = "Wedensday";
							break;
						case 4:
							currentDay = "Thursday";
							break;
						case 5:
							currentDay = "Friday";
							break;
						case 6:
							currentDay = "Saturday";
							break;
					}// end of currentDay switch

					// converting the current day number to its respective day name.

					switch(futureDayNumber)
					{
						case 0:
							futureDay = "Sunday";
							break;
						case 1:
							futureDay = "Monday";
							break;
						case 2:
							futureDay = "Tuesday";
							break;
						case 3:
							futureDay = "Wedensday";
							break;
						case 4:
							futureDay = "Thursday";
							break;
						case 5:
							futureDay = "Friday";
							break;
						case 6:
							futureDay = "Saturday";
							break; 
					}// end of futureday switch

					// displaying the ouput.

					System.out.printf("Today is %s and the future day is %s",currentDay,futureDay);
				
				}//end of if block of daysElapsedNumber
				else
				{

					System.out.println("Invalid input!");

				}//end of else of daysElapsedNumber
		}//end of if block of currentDayNumber
		else
		{	

			System.out.println("Invalid input!");
		
		}//end of else block of currentDayNumber

	}//end of method main
}// end of class