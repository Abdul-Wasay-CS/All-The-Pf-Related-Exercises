import java.util.Scanner;

public class fabconaciiSeries
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number to find the fabonacii Series upto it");
		int limit = input.nextInt();
		int firstNum = 0, secNum = 1, newNum;
		System.out.printf("%d,%d",firstNum,secNum);
		for(int i= 1; i<= limit; i++)
		{
			newNum = firstNum+secNum;
			System.out.printf(",%d",newNum);
			firstNum = secNum;
			secNum = newNum;
		}
	}

}