import java.util.*;

public class YearlyRaifallCalculator
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] cityRainMonth = new int[5][12];

		takeMonthlyRains(cityRainMonth,input);

		int[] yearlyRains = calculateAndPrintYearlyRainfall(cityRainMonth);

		int highestRainCity = calculateHigestRainfallCity(yearlyRains); 

		System.out.println("city "+highestRainCity+" has the highest rainfall."); 
	}//main
	public static void printArray(int[][] arr)
	{
		for(int i =0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
				System.out.printf("%6d",arr[i][j]);
			System.out.println();
		}
	}//printArray

	public static void takeMonthlyRains(int[][] cityRainMonth,Scanner input)
	{
		for(int i=0; i<cityRainMonth.length; i++)
		{
			System.out.print("Enter the rainfall recieved in city "+(i+1)+" in each of the 12 months.");
			for(int j=0; j<cityRainMonth[i].length; j++)
				cityRainMonth[i][j] = input.nextInt();

			System.out.println();
		}
	}//takeMonthlyRains

	public static int[] calculateAndPrintYearlyRainfall(int[][] cityRainMonth)
	{
		int[] cityYearlyRains = new int[cityRainMonth.length];
		for(int i=0; i<cityRainMonth.length; i++)
		{
			int yearlyRain = 0;
			for(int j=0; j<cityRainMonth[i].length; j++)
				yearlyRain += cityRainMonth[i][j];
			cityYearlyRains[i] = yearlyRain;
			System.out.println("The yearly rainfall of city"+(i+1)+" Is "+yearlyRain+" mm per sq.inch");
		}
		return cityYearlyRains;
	}//calculateAndPrintYearlyRainfall

	public static int calculateHigestRainfallCity(int[] cityYearlyRains)
	{
		int highestRainCity=0;
		int highestRain = cityYearlyRains[0];
		for(int i =0; i<cityYearlyRains.length; i++)
		{
			if(cityYearlyRains[i]>highestRain)
			{
				highestRain = cityYearlyRains[i];
				highestRainCity = i+1;
			}
		}

		return highestRainCity;
	}
}//class