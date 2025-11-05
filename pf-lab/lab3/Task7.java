import java.util.*;

public class Task7
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		System.out.print("Enter the number of  class A seats sold: ");
		int numberSeatClassA = console.nextInt();
		int incomeSeatA = numberSeatClassA * 20; 

		System.out.print("\nEnter the number of class B seats sold: ");
		int numberSeatClassB = console.nextInt();
		int incomeSeatB = numberSeatClassB *15;

		System.out.print("\nEnter the number of class C seats sold: ");
		int numberSeatClassC = console.nextInt();
		int incomeSeatC = numberSeatClassC * 10;

		System.out.print("\nEnter the number of class D seats sold: ");
		int numberSeatClassD = console.nextInt();
		int incomeSeatD = numberSeatClassD * 5;

		int totalIncome = incomeSeatA + incomeSeatB + incomeSeatC + incomeSeatD;
		System.out.print("\nThe total income generated is: $"+ totalIncome);

		System.out.printf("\nClass A seats: $%d , Class A Income: $%d",numberSeatClassA,incomeSeatA);

		System.out.printf("\nClass B seats: $%d , Class B Income: $%d",numberSeatClassB,incomeSeatB);
		
		System.out.printf("\nClass C seats: $%d , Class C Income: $%d",numberSeatClassC,incomeSeatC);
		
		System.out.printf("\nClass D seats: $%d , Class D Income: $%d",numberSeatClassD,incomeSeatD);
		
		
	}
}