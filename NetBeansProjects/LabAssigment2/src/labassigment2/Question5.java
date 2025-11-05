
package labassigment2;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input: ");
        String sentence = input.nextLine();
        int sentenceLength = sentence.length();
        
        //Vairables for first and last 'h'.
        int firstInstance = sentence.indexOf("h");
        int lastInstance = sentence.lastIndexOf("h");

        //variable to store the final string
        String finalSentence=sentence;
        //firstInstance+1 starts after the first 'h'
        //< lastInstance stops the replacement process before the last 'h'
        for(int i=(firstInstance+1); i<lastInstance; i++)
        {
            if(sentence.charAt(i)=='h')
            {
                // the first substring stops one character before H.
                finalSentence = finalSentence.substring(0,i)+"H"+finalSentence.substring(i+1);
                //same sentence till the index of "h" , adds "H" to the place after i-1,
                //i.e at the index of "h" , and then joins the rest of the sentence after "h".
            }
        }
        System.out.print("Correct Answer: "+finalSentence);
        
    }
}
