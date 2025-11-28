import java.util.Scanner;

public class SumOfRowsMatrix
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] array = new int[3][4];


		for(int i =0; i<array.length; i++)
		{
			System.out.println("Enter array elements of Row # "+(i+1));
			for(int j =0; j<array[i].length; j++) 
				array[i][j] = input.nextInt();
		}

		System.out.println("The given 2D array is.... ");

		for(int i =0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
				System.out.print(array[i][j]+"\t");
			System.out.println();
		}

		int sum;

		for (int i =0; i<array.length; i++) 
		{
			sum = 0;
			for(int j =0; j<array[i].length; j++)
				sum += array[i][j];

			System.out.println("Sum of Row "+(i+1)+" is "+sum);
		}
	}//main
}//class