import java.io.*;

public class FilesSaving
{
	public static void main(String args[])
	{
		try
		{
		PrintWriter out = new PrintWriter(new FileWriter("data.txt"));
		out.println("Hello this is a test for using files.");
		out.close();
		}	catch(IOException e){
			System.out.println("Error writing file: " +e.getMessage());
		}

	}
}