import java.util.*;
import java.io.*;

public class FIndingMaximumMarks
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
		
		int maxMarks = studentMarks.get(0);
		String maxName =  studentName.get(0);
		for(int i =0; i<studentMarks.size();i++)
			if(studentMarks.get(i) >maxMarks)
			{
				maxMarks = studentMarks.get(i);
				maxName = studentName.get(i);

			}

		System.out.println(maxName+" has Acheived the highest Marks by acheving "+maxMarks+" marks.");

	}//main
}//class