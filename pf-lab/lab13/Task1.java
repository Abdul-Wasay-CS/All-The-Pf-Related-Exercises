import java.util.*;
import java.io.*;

public class Task1
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nums[] = new int[10];
		for(int i =0; i<10; i++)
		{
			System.out.printf("Enter the %d Integer value: ",i+1);
			nums[i] = input.nextInt();
		}		

		try(PrintWriter pw = new PrintWriter("test.txt"))
		{

			pw.write(Arrays.toString(nums)
				.replace("["," ")
				.replace("]"," ")
				.replace(","," "));
		}catch(IOException e1)
		{
			System.out.println("An error occured , "+e1.toString());
		}
	}
}