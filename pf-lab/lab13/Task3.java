import java.util.*;
import java.io.*;

public class Task3
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
			ArrayList<Integer> cleanedList = new ArrayList<>();
			
			for(int element : nums)
				if(!isPrime(element))
					cleanedList.add(element);
			int[] cleanedArray = new int[cleanedList.size()];
			for(int i =0; i<cleanedList.size(); i++)
			{
				cleanedArray[i] = cleanedList.get(i);
			}

			String data = Arrays.toString(cleanedArray).replace("["," ").replace("]"," ").replace(","," ");

			fileReader.close();

			FileOutputStream fos = new FileOutputStream("test.txt");
			PrintStream writer = new PrintStream(fos);

			writer.println(data);

			fos.close();
		}//try
		catch(IOException e1)
		{
			System.out.println("An error occuered ."+e1.toString());
		}
	}//main

	public static boolean isPrime(int n)
	{
		if(n==0 || n==1 || n == 2 )
			return false;
		else
			for(int i=2; i<=Math.sqrt(n); i++)
				if(n%i == 0)
					return false;

		return true;//executes only if the inner if didint execute 
	}
}//class