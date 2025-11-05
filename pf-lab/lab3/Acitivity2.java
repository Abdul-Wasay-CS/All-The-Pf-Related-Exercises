import java.util.*;

public class Acitivity2
{
	public static void main(String args[])
	{
		double regularWages;
		double basePay = 30;
		double regularHours = 50;
		double overtimeWages;
		double overTimePay = 40.50;
		double overtimeHours = 15;
		double totalWages;

		regularWages = basePay * regularHours;
		overtimeWages = overTimePay * overtimeHours;
		totalWages = regularWages + overtimeWages;
		System.out.printf("Wages for this week is $%.2f", totalWages);
	}
}