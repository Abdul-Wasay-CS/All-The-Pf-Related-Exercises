import java.io.*;
import java.util.Scanner;
public class handling_files{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{    
            FileOutputStream fos = new FileOutputStream("data.txt", true);
            
            PrintStream ps = new PrintStream(fos);

            while (true) { 
                System.out.print("Enter text to write to file (type 'exit' to quit): ");
                String userInput = input.nextLine();
                
                if(userInput.equalsIgnoreCase("exit")){
                    break;
                }
                
                ps.println(userInput);
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}