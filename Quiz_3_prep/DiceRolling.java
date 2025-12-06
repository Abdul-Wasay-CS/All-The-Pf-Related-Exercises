import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class DiceRolling
{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int[] combinationCount = new int[11];
		
		//  value-2 gives the index where the  value count is stored.
		
		for(int i=0; i< 36000000; i++)
		{
			int firstRoll = random.nextInt(6)+1;
			int secondRoll = random.nextInt(6)+1;
			int sum = firstRoll+secondRoll;

			updateFrequencyCount(combinationCount, sum);

		}	

		for(int i =0; i<combinationCount.length; i++)
		{
			System.out.println(i+2+" Occurs "+combinationCount[i]+" number of times");
		}
	}//main

	static void updateFrequencyCount(int[] combinationCount, int sum)
	{
		switch(sum)
		{
			//used sum-2 since its easy to copypaste it.
			case 2:
				combinationCount[sum-2]++; 
				break;
			case 3:
				combinationCount[sum-2]++; 
				break;
			case 4:
				combinationCount[sum-2]++; 
				break;
			case 5:
				combinationCount[sum-2]++; 
				break;
			case 6:
				combinationCount[sum-2]++; 
				break;
			case 7:
				combinationCount[sum-2]++; 
				break;
			case 8:
				combinationCount[sum-2]++; 
				break;
			case 9:
				combinationCount[sum-2]++; 
				break;
			case 10:
				combinationCount[sum-2]++; 
				break;
			case 11:
				combinationCount[sum-2]++; 
				break;
			case 12:
				combinationCount[sum-2]++; 
				break;
			
		}//end of switch
	}//updateFrequencyCount
}//class