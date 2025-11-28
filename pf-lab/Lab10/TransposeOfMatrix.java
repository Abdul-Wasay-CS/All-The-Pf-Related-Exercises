import java.util.Scanner;

public class TransposeOfMatrix
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] matrix1 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};

		//matrix for storing transpose

		int matrix2[][] = new int[4][3];

		for(int i =0; i<matrix1.length; i++)
		{
			for(int j=0; j<matrix1[i].length; j++)
				System.out.print(matrix1[i][j]+"\t");
			System.out.println();
		}

		matrix2 = transpose(matrix1);

		System.out.println("Transpose of the given matrix is ..");

		for(int i =0; i<matrix2.length;i++)
		{
			for(int j=0; j<matrix2[i].length; j++)
				System.out.print(matrix2[i][j]+"\t");
			System.out.println();
		}

	}//main


	public static int[][] transpose(int[][] matrix)
	{
		int[][] trans = new int[4][3];
		for(int i=0; i<4;i++)
			for(int j=0; j<3; j++)
				trans[i][j]= matrix[j][i];

		return trans;
	}//transpose
}//class