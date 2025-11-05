package pfassigment2;
import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String line = input.nextLine();
        
        int lineLength  = line.length();
        int vowelCount = 0;
        for(int i = 0; i<lineLength; i++)
        {
            switch(line.charAt(i))
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
                    vowelCount++;
                    break;
                //does nothing if the above cases are not true.
            }    
        }
        System.out.printf("There are %d vowels in the entered sentnce.",vowelCount);
    }
}
