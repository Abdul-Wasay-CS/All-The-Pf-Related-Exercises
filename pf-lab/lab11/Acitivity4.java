import java.util.*;

public class Acitivity4
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try
		{
			int arr[] = {5, 0, 1, 2};
			try{
				int x = arr[3]/arr[1];
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Divide by zero ");
			}
			arr[4] = 3;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index out of bound Exception ");
		}
	}//main
}//class