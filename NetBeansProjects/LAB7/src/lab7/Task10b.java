
package lab7;
import java.util.Scanner;
public class Task10b {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a number to find its binary: ");
        int number = input.nextInt();
        String eqRevBin = toBinary(number,"");
        String correctBin = correctTheBinary(eqRevBin);
        
        System.out.println("The binary of the given number is :" + correctBin);
    }
    
    static String toBinary(int n,String bin)
    {
        if(n==1)
        {
            bin += 1;
            return bin;
        }
        else
        {
            bin += (n%2);
            return toBinary(n/2,bin);
        }
    }//end of toBinary
    
    static String correctTheBinary(String reverseBin)
    {
        String correctBin ="";
        int length = reverseBin.length();
        for(int i = length-1; i>=0; i--)
        {
          correctBin += reverseBin.charAt(i);
        }
        return correctBin;
    }
}
