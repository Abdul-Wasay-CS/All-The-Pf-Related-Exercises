import java.util.*;
import java.io.*;

public class StoreDataInFile
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> studentRno = new ArrayList<>();
        ArrayList<String> studentName = new ArrayList<>();
        ArrayList<Integer> studentMarks = new ArrayList<>();

        int i =0;
        while(true)
        {
            System.out.println("Enter the rno of the student no "+(i+1));
            String rno = input.nextLine();
            System.out.println("Enter the Name of the student no "+(i+1));
            String name = input.nextLine();
            System.out.println("Enter the Marks of the student no "+(i+1));
            int marks = input.nextInt();
            input.nextLine();
            
            if(marks == 0)
                break;
            studentName.add(name);
            studentMarks.add(marks);
            studentRno.add(rno);
               
            i++;
        }

        try
        {
            FileOutputStream file = new FileOutputStream("students.txt",true);
            PrintStream writer = new PrintStream(file);
            for(int j =0; j<studentMarks.size(); j++)
            {
                writer.println(studentRno.get(j));
                writer.println(studentName.get(j));
                writer.println(studentMarks.get(j));
            }
        }
        catch( IOException e)
        {
            System.out.println("Something Went wrong.");
        }
    }
}