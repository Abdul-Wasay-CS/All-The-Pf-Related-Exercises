import java.util.Scanner;
import java.util.Arrays;

public class RandomMatrixAndIdenticalCheck
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length of the matrix: ");
		int size = input.nextInt();

		int[][] matrix = new int[size][size];


		for(int i = 0; i< matrix.length; i++)
		{
			for(int j = 0; j<matrix[i].length; j++)
			{
				matrix[i][j] = (int)(Math.round((Math.random())));
				System.out.printf("%-3d",matrix[i][j]);
			}
			System.out.println();
		}

		boolean isNoSameElementRow = true;
		//zero and ones row chcker 
		for(int i = 0; i<matrix.length; i++)
		{
			boolean isRowZero = true;
			boolean isRowOne = true;
			for(int j = 0; j<matrix[i].length; j++)
			{
				int currentElement = matrix[i][j]; //to make changes easier
				if(currentElement == 0)
				{
					isRowOne = false; 
				}
				else
				{
					isRowZero = false;
				}
			}

			if(isRowZero)
			{
				isNoSameElementRow = false;	
				System.out.println("All 0s on Row "+(i+1));
			}
			else if(isRowOne)
			{
				isNoSameElementRow = false;
				System.out.println("All 1s on Row"+(i+1));
			}
		}//outer for

		if(isNoSameElementRow)
			System.out.println("No same number on a Row");
		
		//coulumn check
		boolean isNoSameElementColumns = true;
		for(int i = 0; i<matrix.length; i++)
		{
			boolean isCoulumnZero = true;
			boolean isCoulumnOne = true;
			for(int j = 0; j<matrix[i].length; j++)
			{
				int currentElement = matrix[j][i]; //to make changes easier
				if(currentElement == 0)
					isCoulumnOne = false; 
				else
					isCoulumnZero = false;
			}

			if(isCoulumnZero)
			{
				isNoSameElementColumns = false;
				System.out.println("All 0s on column "+(i+1));
			}
			else if(isCoulumnOne)
			{
				isNoSameElementColumns = false;
				System.out.println("All 1s on coulumn"+(i+1));
			}
		}//outer for

		if(isNoSameElementColumns)
			System.out.println("No Same Numbers on a column");

		//check for major diagonal
		boolean isDiagZero = true, isDiagOne = true;
		for(int i = 0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[i].length; j++)
			{
				if(i == j)
				{
					int currentElement = matrix[i][j];
					if(currentElement == 0)
					{
						isDiagOne = false;
					}
					else
					{
						isDiagZero = false;
					}
				}
			}
		}//outer for

		if(isDiagZero)
			System.out.println("All 0s on Major Diagonal");
		else if(isDiagOne)
			System.out.println("All 1s on Major Diagnoal");
		else
			System.out.println("No Same numbers on the major Diagonal");


		//check for sub diagonal

		boolean isSubDiagZero = true;
		boolean isSubDiagOne= true;
		
		for(int i = 0; i<matrix.length; i++)
		{
			for(int j= 0;j<matrix.length; j++)
			{
				if(i+j == matrix.length-2)
				{
					//condition for sub-diagonal element met
					int currentElement = matrix[i][j];
					if(currentElement == 0)
						isSubDiagOne = false;
					else
						isSubDiagZero = false;
				}
			}	
		}//end of outer for

		if(isSubDiagZero)
			System.out.println("All 0s on the subdiagonal");
		else if(isSubDiagOne)
			System.out.println("All 1s on the subdiagonal");
		else
			System.out.println("No same numbers on the sub-diagonal");


	}//main
}//class