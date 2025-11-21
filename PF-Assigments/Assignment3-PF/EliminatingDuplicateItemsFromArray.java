import java.util.Scanner;

public class EliminatingDuplicateItemsFromArray
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int list[] = new int[10];
		System.out.print("Enter Ten Numbers: ");
		for(int i=0; i<list.length; i++)
		{
			list[i] = input.nextInt();
		}
		int[] duplicateFreeArray = elimintaeDuplicates(list);

		System.out.print("The distinct Numbers are: ");
		for(int n:duplicateFreeArray)
			System.out.print(n + " ");

	}//main


	public static int[] elimintaeDuplicates(int[] list)
	{
		int[] cleanedArray = new int[list.length];
		//flag variable to check if value was found or not
		boolean isUniqueValue;
		System.out.print("Enter 10 Numbers: ");
		int uniqueIndex = 0;
		for(int i = 0; i<10; i++)
		{
			isUniqueValue = true;
			for(int j=1; j<uniqueIndex; j--)
			{
				if(list[i] == cleanedArray[j])
				{
					isUniqueValue = false;
					break;
				}
			}

			if(isUniqueValue)
			{
				cleanedArray[uniqueIndex] = list[i];
				uniqueIndex++;
			}
		}//end of outer for
		int[] duplicateFreeArray = new int[uniqueIndex];
		return Arrays.copyOf(cleanedArray,uniqueIndex);
	}//eliminateDuplicate
}//class