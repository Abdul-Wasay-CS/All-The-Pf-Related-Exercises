
package lab6;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        //first f index
        int indexFirstOcc = sentence.indexOf("f");
        //last f index
        int indexLastOcc = sentence.lastIndexOf("f");
        
        if(indexFirstOcc != indexLastOcc)
            System.out.printf("Correct Answer: %d %d",indexFirstOcc,indexLastOcc);
        else if(indexFirstOcc != -1 && indexFirstOcc == indexLastOcc)
            System.out.printf("Correct Answer: %d",indexFirstOcc);
        
        
        System.out.println();
        }
    }
}
