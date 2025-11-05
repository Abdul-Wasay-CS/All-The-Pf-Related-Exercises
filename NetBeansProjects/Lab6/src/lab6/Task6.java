
package lab6;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two words seperated by one space: ");
        String orgSentence = input.nextLine();
        
        int spaceIndex = orgSentence.indexOf(" ");
        
        //stores the first word
        String firstWord = orgSentence.substring(0, spaceIndex);
        
        //stores the second word
        String secondWord = orgSentence.substring(spaceIndex+1);
        
        //swapped postion String
        String swappedString = secondWord +" "+  firstWord;
        
        System.out.println("The swapped string is: \" " +swappedString+" \"");
    }
}
