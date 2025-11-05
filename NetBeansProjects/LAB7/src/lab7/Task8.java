
package lab7;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String sentence = input.nextLine();
        
        int numberOfVowels = countVowels(sentence);
        
        System.out.println("Number of Vowels in the String : " + numberOfVowels);
    }//end of main method
    
    static int countVowels(String workingSentence)
    {
        int length = workingSentence.length();
        int vowelCounter= 0;
        for(int i = 0 ; i< length; i++)
        {
            char currentChar = workingSentence.charAt(i);
            switch(currentChar)
            {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    vowelCounter++;
                    break;
                default:
                    //do nothing
            }//end of switch
        }//end of loop
        return vowelCounter;
    }//end of method countVowels()
}//end of class
