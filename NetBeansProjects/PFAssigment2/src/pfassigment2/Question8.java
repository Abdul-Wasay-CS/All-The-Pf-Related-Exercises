package pfassigment2;
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Takes the decimal number to be converted.
        System.out.println("Enter a decimal number: ");
        int deci = input.nextInt();
        String bin = "";
        
        //variable to store each bit, 
        int bit;
        
        //dealing with the zero exception
        if(deci == 0)
            bin ="0";
        
        //finds the binary in reverse order and 
        //stores it in a string
        
        while(deci!=0)
        {
            bit = deci%2;
            bin = bin+bit;
            
            deci /=2;
            if(deci == 1 )
            {
                bin = bin+deci;
                break;
            }
        }
        
        //variable to store the length of the binary number
        
        int binlength = bin.length();
        
        //gives the correct sequnce of bits by 
        //reversing the reversed binary number
    
        for(int i =(binlength-1) ; i>=0; i--)
            System.out.print(bin.charAt(i));
            
    }
}
