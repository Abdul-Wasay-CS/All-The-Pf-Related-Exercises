import java.util.*;
import java.io.*;
import java.nio.file.*;
public class CountFileWords 
{
    public static void main(String[] args) 
    {
        try
        {
            Path path = Paths.get("dataFiles","input.txt");
            FileInputStream fis = new FileInputStream(path.toString());
            Scanner reader = new Scanner(path.toFile());
            
            //  to keep track of the data being read.

            int totalLines = 0, totalWords =0, longestWordLength =0;
            String longestWord="";
            while(reader.hasNextLine())
            {
                String line =  reader.nextLine();
                if(line.isBlank())
                    continue;
                String[] words = line.split(" |,|;");
                for(int i =0; i<words.length; i++)
                {
                    if(words[i].length()>longestWordLength)
                    {
                        longestWordLength = words[i].length();
                        longestWord = words[i];
                    }
                }
                totalWords += words.length;
                totalLines++;
            }

            System.out.println("Longest Word: "+longestWord+" \nLongest Length: "+longestWordLength);
            System.out.println("Total Words: "+totalWords);
            System.out.println("Total Lines: "+totalLines);

        }
        catch(FileNotFoundException e)
        {
            System.out.println("Something went wrong");
            try
            {
                Path path = Paths.get("dataFiles","input.txt");
                File file = new File(path.toString());
                
                if(file.createNewFile())
                    System.out.println("File Successfully created.");
                else
                    System.out.println("File could nto be created");   
            }
            catch(Exception e1)
            {
                System.out.println("Error with the file");
            }
        }
        catch(Exception e2)
        {
            System.out.println("An Unexpected Error Occurred: "+e2.toString());
        }

    }
}
