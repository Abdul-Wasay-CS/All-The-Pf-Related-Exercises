import java.util.Scanner;
import java.util.Arrays;

public class StudentManger
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int students[][] = new int[10][6];

		for(int i =0; i<students.length; i++)
		{
			for(int j =0; j<students[i].length; j++)
			{
				//decides the prompt to be displyed
				if(j!=0)
				{
					int currentSubjectNo =j;
					System.out.println("Enter the students+"+(i+1)+"'s "+(findSubject(currentSubjectNo)) + "'s Marks:");
				}
				else
				{
					System.out.println("Enter the student  "+(i+1)+"'s Roll no: ");
				}

				students[i][j]=input.nextInt();
			}
		}//outer for

		int highestTotal = 0;
		int highestTotalRollNo = 0;
		for(int i = 0; i<students.length; i++)
		{
			int totalMarks = 0;
			for(int j= 1; j<students[i].length; j++)
				totalMarks += students[i][j];

			if(totalMarks > highestTotal)
			{
				highestTotal = totalMarks;
				highestTotalRollNo = students[i][0];
			}
		}

		int highestPfRollno = students[0][0];
		int highestPfMarks = students[0][1];
		for(int i =0;i<students.length; i++)
		{
			if(students[i][1] > highestPfMarks)
			{
				highestPfMarks = students[i][1];
				highestPfRollno = students[i][0];
			}
		}


		System.out.println("The rollno of the student with the highest total marks is: "+highestTotalRollNo);
		System.out.println("The rollno of the student with the highest Pf marks is: "+highestPfRollno);

		for(int i =0 ; i <students.length; i++)
		{
			int highest = 0; 
			for(int j =1; j<students[i].length; j++)
			{
				int currentMarks = students[i][j];

				if(currentMarks > highest)
					highest = currentMarks;
			}

			System.out.println("The higest marks of rollno " +students[i][0]+ " is " + highest);
		}		



	}//main





	public static String findSubject(int subjectNo)
	{
		switch(subjectNo)
		{
			case 1:
				return "Programming Fundamentals";
			case 2:
				return "ICT";
			case 3:
				return "Funcational English";
				
			case 4:
				return "Civics";
			case 5:
				return "Islamic Studies";
			default:
				return "Something ducked up";
		}
	}
}