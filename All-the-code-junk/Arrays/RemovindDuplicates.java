import java.util.Scanner;
import java.util.Arrays;

public class RemovindDuplicates
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] unique = new int[5];
		int uniqueIndex =0;
		for(int i =0 ; i<unique.length; i++)
		{
			boolean isUnique = true;		
			int userInput;
			do{
				System.out.print("Enter a number: ");
				userInput = input.nextInt();
			}while(userInput< 10 || userInput > 100);
			
			for(int j=0; j<uniqueIndex; j++)
			{
				if(unique[j] == userInput)
					isUnique = false;
			}

			if(isUnique)
			{
				unique[uniqueIndex] = userInput;
				uniqueIndex++;	

				for(int j=0 ;j<uniqueIndex; j++)
				{
					System.out.print(unique[j]+" ");
				}
				System.out.println();
			}
		}//end of outer for
	}//main
}//class