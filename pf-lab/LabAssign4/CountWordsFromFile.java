import java.util.*;
import java.io.*;

public class CountWordsFromFile
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PrintStream writer = null;

		// Writing to file
		try
		{
			writer = new PrintStream("sample.txt");

			while(true)
			{
				System.out.println("Enter word, press 0 to quit.");
				String word = input.next();

				if(word.equals("0"))
					break;

				writer.println(word);
			}

		}
		catch(FileNotFoundException e1)
		{
			System.out.println("File Was not found, creating file by the name \"sample.txt\"");
			try
			{
				// Create the file and retry
				writer = new PrintStream("sample.txt");
				
				// Rewrite the input loop
				while(true)
				{
					System.out.println("Enter word, press 0 to quit.");
					String word = input.next();

					if(word.equals("0"))
						break;

					writer.println(word);
				}
			}
			catch(Exception e)
			{
				System.out.println("Error: "+e);
				return;
			}
		}
		catch(Exception e2)
		{
			System.out.println("Something unexpected happened, Display for debugging: "+e2);
		}
		finally
		{
			// Close the writer if it was opened
			if(writer != null)
			{
				writer.close();
			}
		}

		// Reading from file
		int wordCount = 0;
		Scanner reader = null;
		
		try{
			reader = new Scanner(new File("sample.txt"));
			ArrayList<String> words = new ArrayList<>();

			while(reader.hasNextLine())
			{
				String currentWord = reader.nextLine().trim();
				// Only add non-empty lines
				if(!currentWord.isEmpty())
				{
					words.add(currentWord);
				}
			}

			wordCount = words.size();
		}
		catch(Exception e3)
		{
			System.out.println("An error occurred: "+e3);
		}
		finally
		{
			// Close the reader if it was opened
			if(reader != null)
			{
				reader.close();
			}
		}

		System.out.println("The total words in the file are: "+wordCount);
		
		// Close the input scanner
		input.close();
	}//main
}//class