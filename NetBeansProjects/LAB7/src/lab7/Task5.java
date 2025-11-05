
package lab7;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a sentence : ");
        String sentence = input.nextLine();
        int numberOfLetters = countLetters(sentence);
        
        System.out.println("There are "+ numberOfLetters +"  letters in the given string");
    }
    public static int countLetters(String s)
    {
        int letterCount=0;
        int length = s.length();
        int currentChar;
        for(int i = length-1; i>= 0; i--)
        {
            currentChar = s.charAt(i);
            if((currentChar >= 'A' && currentChar<='Z') || (currentChar >='a' && currentChar <= 'z'))
                letterCount++;
        }
        return letterCount;
    }
}
