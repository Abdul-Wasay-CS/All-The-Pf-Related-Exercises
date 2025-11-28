import java.util.*;
public class RandomMatrixFiller
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//can generate input mismatch exception
		System.out.println("Enter the number of rows in the 2D array: ");
		int rowSize = input.nextInt(); 
		System.out.println("Enter the number of elmenets in each row of the 2D array");
		int columnSize = input.nextInt();
		double[][] array =new double[rowSize][columnSize];

		putRandomValueInArray(array);

		printArray(array);
		int columnChoice;
		do
		{
			System.out.println("Enter the column to find its sum: ");
			columnChoice = input.nextInt();
		}while(columnChoice >=columnSize || columnChoice < 0);			

		double sum = sumColumn(array, columnChoice-1);

		System.out.printf("The sum of the required column is %.2f",sum);
	}

	public static double sumColumn(double[][] m, int n)
	{
		double sum=0;

		for(int i =0; i<m.length; i++)
			sum += m[i][n];

		return sum;
	}


	public static void putRandomValueInArray(double [][] array)
	{
		Random random = new Random();
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
				array[i][j] = Double.parseDouble(String.format("%.2f",random.nextDouble()*50));
		}

		printArray(array);
	}

	public static void printArray(double[][] array)
	{
		for(int i=0; i< array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
				System.out.printf("%10.2f",array[i][j]);
			System.out.println();
		}
	}
}//class