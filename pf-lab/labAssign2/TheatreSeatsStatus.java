import java.util.Scanner;

public class TheatreSeatsStatus
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] theatreSeats = new int[5][10];

		for(int i=0; i<theatreSeats.length; i++)
			for(int j=0; j<theatreSeats[i].length; j++)
				theatreSeats[i][j] = (int)(Math.round(Math.random()));

		int totalSeats = findTotalAvailSeats(theatreSeats);

		int[] rowSeats = findRowsAvailSeats(theatreSeats);

		printArray(theatreSeats);

		System.out.println("The total number of seats avalable in the theatre is "+totalSeats);

		for(int i =0; i<rowSeats.length; i++)
			System.out.println("The seats avalable in Row "+(i+1)+" are: "+rowSeats[i]);
	}


	public static int findTotalAvailSeats(int[][] theatreSeats)
	{
		int availCount = 0;

		for(int i =0; i<theatreSeats.length; i++)
			for(int j=0; j<theatreSeats[i].length; j++)
				if(theatreSeats[i][j] == 1)
					availCount++;

		return availCount;
	}

	public static int[] findRowsAvailSeats(int[][] theatreSeats)
	{
		int[] rowAvailCounts= new int[theatreSeats.length];
		for(int i=0; i<theatreSeats.length; i++)
		{
			int availCount = 0;
			for(int j=0; j<theatreSeats[i].length; j++)
				if(theatreSeats[i][j] == 1)
					availCount++;

			rowAvailCounts[i] = availCount;
		}

		return rowAvailCounts;
	}

	public static void printArray(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
				System.out.printf("%5d",arr[i][j]);
			System.out.println();
		}
	}o


}//class