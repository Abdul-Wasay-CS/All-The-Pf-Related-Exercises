import java.util.Scanner;

public class StudentsMarks
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] studentsMarks = new int[3][4];
		populateArrayFromUser(studentsMarks,input);

		findAndPrintAverage(studentsMarks);

		findAndPrintHigestMarks(studentsMarks);
	}
	public static void populateArrayFromUser(int[][] students, Scanner input)
	{
		for(int i=0; i<students.length; i++)
		{
			System.out.print("Enter the Marks of student no "+(i+1));
			for(int j=0; j<students[i].length; j++)
				students[i][j] = input.nextInt();
		}
	}//populateArrayFromUser

	public static void findAndPrintAverage(int[][] students)
	{
		for(int i=0; i<students.length; i++)
		{
			int sum = 0;

			for(int j=0;j<students[i].length;  j++)
			{
				sum += students[i][j];
			}
			final int TOTALSUBJECTS = 4; 
			int avg = (int)(sum/TOTALSUBJECTS);
			System.out.println("The average marks of student no "+(i+1)+" is "+avg);
		}
	}	

	public static void findAndPrintHigestMarks(int[][] marks)
	{
		int highestMarks;
		for(int i=0; i<marks[0].length; i++)
		{
			highestMarks = 0;

			for(int j=0; j<marks.length; j++)
			{
				if(marks[j][i]>highestMarks)
					highestMarks = marks[j][i];
			}

			System.out.println("The highest marks in subject no "+(i+1)+" is "+highestMarks);
		}
	}//findAdnPrintHighestMarks
}//class