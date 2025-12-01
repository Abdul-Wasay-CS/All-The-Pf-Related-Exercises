import java.util.*;

public class Task2
{
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);

		int array[] = new int[10];

		for(int i=0; i<array.length; i++)
		{
			while(true)
			{
				try{
					System.out.print("Enter the element no "+(i+1)+" ");
					array[i] = input.nextInt();
					break;
				}
				catch(InputMismatchException e)
				{
					System.out.println("Please enter a valid Number ");
					input.nextLine();
				}
			}//end of while
		}

		while(true)
		{
			try{
				System.out.println("Enter an index to find the value at that index: ");
				int index = input.nextInt();
				System.out.println("The value at "+index+" is "+array[index]);

				break;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid index , pls enter a valid index");
				input.nextLine();
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("Invalid Index, pls enter the index within 9");
				input.nextLine();
			}
			catch(Exception exc)
			{
				System.out.println("An Unknown Error occured ");
				input.nextLine();
			}
		}//while
	}//main
}//class