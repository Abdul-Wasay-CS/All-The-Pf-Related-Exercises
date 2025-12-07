import java.util.*;
import java.io.*;

public class CountWordsFromFile
{
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);

		try
		{
			PrintStream writer = new PrintStream("sample.txt");

			while(true)
			{
				System.out.println("Enter word, press 0 to quit.");
				String word = input.next();

				if(word.equals("0"))
					break;

				writer.println(word + "  ");
			}

		}
		catch(FileNotFoundException e1)
		{
			System.out.println("File Was not found, creating file by the name \"sample.txt\"");
			try
			{
				FileOutputStream file =  new FileOutputStream("sample.txt",true);
			}
			catch(Exception e)
			{
				System.out.println("Error: "+e);
			}
		}
		catch(Exception e2)
		{
			System.out.println("Something unexpected happened , Display for debugging: "+e2);
		}

		//readin from file

		int wordCount = 0;
		try{
			Scanner reader = new Scanner("sample.txt");
			ArrayList<String> words = new ArrayList<>();

			while(reader.hasNext())
			{
				String currentWord = reader.next();
				words.add(currentWord);
			}

			wordCount = words.size();
		}
		catch(Exception e3)
		{
			System.out.println("An error ocurred: "+e3);
		}

		System.out.println("The total words in the file are: "+wordCount);
	}//main
}//class