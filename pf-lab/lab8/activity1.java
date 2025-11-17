import java.util.Scanner;

public class activity1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] arr = new int[10];

		System.out.println("enter the array elements:");
		for(int i=1; i<10; i++)
		{
			System.out.println("Enter the value of "+i+ "index:");
			arr[i] = input.nextInt();
		}

		int largest = arr[0];

		for(int i = 0; i<10; i++)
		{
			if(arr[i]>largest)
				largest = arr[i];
		}

		int largest2;
		if(largest == arr[0])
			largest2 = arr[1];
		else
			largest2 = arr[0];

		for(int i=0; i<10; i++)
		{
			if(arr[i] != largest && arr[i] > largest2)
			{
				largest2 = arr[i];
			}

		}

		System.out.println("Largest =" + largest);
		System.out.println("Largest2 =" + largest2);
	}//end of method
}//end of class