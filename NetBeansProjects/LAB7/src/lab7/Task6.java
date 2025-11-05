
package lab7;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String sentence = input.nextLine();
        String captilizedSentence = capitalize(sentence);
        System.out.println("The captilized vesrion is \n"+captilizedSentence);
    }
    public static String capitalize( String sentence)
    { 
        String captlizedSentence = sentence;
        int length = sentence.length();
        //to store the each character for an interation
        char currentChar,captilizedChar;
        // to captilize a character , just subtract 32 from the lower Case letter
        for(int i = 0; i < length; i++)
        {
            //first word exception
            if(i == 0)
            {
                currentChar=sentence.charAt(i);
              if(currentChar >= 'a' && currentChar <='z')
              {
                    captilizedChar = (char)(currentChar - 32);
                    //replaces the current letter by the capitilized letter
                    captlizedSentence = captlizedSentence.substring(0, i)+captilizedChar+captlizedSentence.substring(i+1);
               }
              }//end of first word exception
            if ( captlizedSentence.charAt(i) == ' ')
              {
                // since the character after the space will be the new word's first character
                currentChar = captlizedSentence.charAt(i+1);
                 if(currentChar >= 'a' && currentChar <='z')
              {
                    captilizedChar = (char)(currentChar - 32);
                    //replaces the current letter by the capitilized letter
                    captlizedSentence = captlizedSentence.substring(0, i+1)+captilizedChar+captlizedSentence.substring(i+2);
               }
            }
        }//end of loop
        return captlizedSentence;
    }
}
