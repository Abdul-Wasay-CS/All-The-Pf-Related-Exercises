import java.util.Scanner;

public class MaxSumRow
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] array = new int[3][4];

		for(int i=0; i<array.length;i++)
		{
			System.out.println("Enter elements of Row # "+(i+1));
			for(int j=0; j<array[i].length; j++)
				array[i][j] = input.nextInt();
		}

		int maxRowSum =0;
		int maxRow =1;//default value
		for(int i =0;i<array.length;i++)
		{
			int sum = 0;
			for(int j=0;j<array.length; j++)
				sum += array[i][j];

			if(sum>maxRowSum)
			{
				maxRowSum = sum;
				maxRow = i+1;
			}
		} 

		System.out.println("Row #"+maxRow+" has the maximum sum");

		//part 2

		int maxColumnSum = 0;
		int maxColumn = 1;

		for(int i =0;i<array.length;i++)
		{
			int sum = 0;
			for(int j=0;j<array.length; j++)
				sum += array[j][i];

			if(sum>maxColumnSum)
			{
				maxColumnSum = sum;
				maxColumn = i+1;
			}
		} 

		System.out.println("Column #"+maxColumn+" has the highest sum");


	}
}