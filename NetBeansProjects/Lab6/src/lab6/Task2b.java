
package lab6;
import java.util.Scanner;
public class Task2b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a Character: ");
        String ch = input.next();
        
        int uni = ch.codePointAt(0);
        
        System.out.println("The Unicode for the character E is "+uni);
    }
}
