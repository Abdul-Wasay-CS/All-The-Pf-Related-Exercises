
package lab6;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        
        int firstIndex, lastIndex;
        
        firstIndex = sentence.indexOf("h");
        
        lastIndex = sentence.lastIndexOf("h");
        
        //make a string with the characters before first h
        // and after the last h
        
        String finalString = sentence.substring(0, firstIndex) +sentence.substring(lastIndex+1);
        
        System.out.println("Correct Answer: " +finalString);
    }
}
