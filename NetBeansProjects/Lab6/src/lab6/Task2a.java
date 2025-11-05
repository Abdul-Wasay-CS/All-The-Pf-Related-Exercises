
package lab6;
import java.util.Scanner;
public class Task2a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an ASCII code: ");
        int ascii = input.nextInt();
        
        if(ascii>=0 && ascii<=127)
        {
        //stores the character
        char ch = (char)ascii;
        
        System.out.println("The character for ASCII is "+ ch);
        }
        else
        {
            System.out.println("Invalid!");
        }
    }
}
