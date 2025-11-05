package pfassigment2;
import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a Sentence: ");
        String line = input.nextLine();
        //finding the length of the string
        
        int lineLength = line.length();
        
        // reversing the string
        // stating value is length - 1 , 
        //since the last index is one less than the length.
        //i.e zero base indexing
        
        for(int i = (lineLength-1); i>=0; i--)
        {
            System.out.print(line.charAt(i));
        }
    }
}
