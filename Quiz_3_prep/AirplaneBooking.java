import java.util.Scanner;
import java.util.Arrays;
// import java.util.Random;

public class AirplaneBooking
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean[] seatsStatus = new boolean[10]; 
		String[] names = new String[10];
		int passengerIndex = 0;
		//seat number = index + 1

		System.out.println("		Ticket Booking.                  ");
		System.out.println("Please Enter your Name: ");
		String passengerName = input.nextLine();
		
		System.out.println("Please choose the class of your ticket: ");
		System.out.println("1.First Class");			
		System.out.println("2.Econonmy Class ( Most Popular )");

		int classChoice = input.nextInt();
		int startSeat, endSeat;
		
		if(class == 1)
		{
			startSeat = 0;
			endSeat = 4;
		}
		else if(class == 2)
		{
			startSeat = 5;
			endSeat = 9;
		}
		
		int seatIndex;
		boolean seatFound = false;
		
		for(int i=startSeat; i<= endSeat; i++)
		{
			if(seatsStatus == false)
			{
				seatFound = true;
				seatIndex = i;
			}
		}

		if(seatFound)
		{
			names[passengerIndex] = passengerName;
			passengerIndex++;
		}
		else
		{
			
		}
	}
}