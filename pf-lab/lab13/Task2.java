import java.util.*;
import java.io.*;

public class Task2
{
	public static void main(String[] args) 
	{
		try(FileInputStream fis = new FileInputStream("test.txt"))
		{
			ArrayList<Integer> nums = new ArrayList<>();
			Scanner fileReader = new Scanner(fis);
			while(fileReader.hasNextInt())
			{
				int currentNum = fileReader.nextInt();
				nums.add(currentNum);
			}

			int[] numArray = new int[nums.size()];
			for(int i =0; i<nums.size(); i++)
			{
				numArray[i] = nums.get(i);
			}

			Arrays.sort(numArray);

			String data = Arrays.toString(numArray).replace("["," ").replace("]"," ").replace(","," ");

			System.out.printf("""
				The array in sorted form is
				%s
				 """,data);
		}
		catch(IOException e1)
		{
			System.out.println("Somethign wnet wrong");
		}
	}
}