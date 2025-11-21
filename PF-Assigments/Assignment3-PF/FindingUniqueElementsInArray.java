import java.util.Scanner;
public class FindingUniqueElementsInArray
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] list = new int[10];
		int[] unique = new int[10]; //max unique numbers can be 10 numbers
		//flag variable to check if value was found or not
		boolean isUniqueValue;
		System.out.print("Enter 10 Numbers: ");
		int uniqueIndex = 0;
		for(int i = 0; i<10; i++)
		{
			isUniqueValue = true;
			list[i] = input.nextInt();
			for(int j=i-1; j>=0; j--)
			{
				if(list[i] == list[j])
				{
					isUniqueValue = false;
					break;
				}
			}

			if(isUniqueValue)
			{
				unique[uniqueIndex] = list[i];
				uniqueIndex++;
			}
		}//end of outer for
		System.out.println("The number of distinct numbers is " + uniqueIndex);
		System.out.print("The distict Numbers are:");
		for(int i=0; i<unique.length; i++)
		{	//breaks when unique value ends
			if(i<unique.length-2)	// to avoid arrayIndexOutOfBound exception
			{
				if(unique[i] == 0 && unique [i+1] == 0 )
					break;
			}
				System.out.print(unique[i]+ " ");
		}//outer for
	}//main
}//class
