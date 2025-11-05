
public class RandomMonthGenerator
{
	public static void main(String args[])
	{
		int max = 12;
		int min = 1;
		int randomMonthNumber = (int)(Math.random()*(max - min)) + 1; // here max - min gives the range, while 1 to keep the minimum 1.
		
		switch(randomMonthNumber)
		{

			case 1:
				System.out.println("January");
				break; 

			case 2:   
				System.out.println("Febuary");
				break;
			
			case 3:
				System.out.println("March");
				break;

			case 4:
				System.out.println("April");
				break;

			case 5:
				System.out.println("June");
				break;
				
			case 6:
				System.out.println("July");
				break;	

			case 7:   
				System.out.println("August");
				break;

			case 8:   
				System.out.println("September");
				break;

			case 10:   
				System.out.println("October");
				break;

			case 11:   
				System.out.println("November");
				break;

			case 12:   
				System.out.println("December");
				break;			
						
		}	// end of switch

	}// end of method main
}// end of class