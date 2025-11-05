
package lab6;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
       System.out.println("Enter a String:");
       String word = input.next(); 
        
        int wordLength = word.length();
        String reverseWord="";
        for(int i = (wordLength-1); i>=0; i--)
        {
            reverseWord += word.charAt(i);
        }
        
        if(word.equalsIgnoreCase(reverseWord))
        {
            System.out.println(word + " is a palindrome.");
        }
        else
        {
            System.out.println(word +" is not a palindrome.");
        }
    }
}
