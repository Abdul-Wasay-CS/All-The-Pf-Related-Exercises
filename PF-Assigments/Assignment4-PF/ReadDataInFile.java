import java.util.*;
import java.io.*;

public class ReadDataInFile
{
	public static void main(String[] args) {
	
		ArrayList<String> studentRno = new ArrayList<>();
		ArrayList<String> studentName = new ArrayList<>();
		ArrayList<Integer> studentMarks = new ArrayList<>();
		try(FileInputStream file = new FileInputStream("students.txt"))
		{
			Scanner reader = new Scanner(file);
			
			while(reader.hasNextLine())
			{
				studentRno.add(reader.nextLine());
				//reader.nextLine();//clear the nextline 
				studentName.add(reader.nextLine());
				//reader.nextLine();//clear the nextline 
				studentMarks.add(reader.nextInt());
				reader.nextLine();//clear the nextLine
			}
			reader.close();
		}
		catch(IOException e)
		{
			System.out.println("Some error Occurred................."+e);
		}
		int numOfPassStudents=0;

		for(int i =0; i<studentMarks.size();i++)
			if(studentMarks.get(i) >50)
				numOfPassStudents++;

		System.out.println("The total Number of passed students are "+(numOfPassStudents));
	}//main
}//class