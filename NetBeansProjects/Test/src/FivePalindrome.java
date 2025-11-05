import java.util.Scanner;

public class FivePalindrome {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int num;
        while(true)
        {
            
        System.out.println("Enter a Five Digit number:");
        num = input.nextInt();
        if(num%1000000 != num || num%10000 == num)
            System.out.println("The entered number is not a five digit number.");
        else
            break;
        }// end of validation loop
        
        int d1,d2,d3,d4,d5,reverseNum,temp = num;
        
        d1 = temp%10;
        temp/=10;
        d2 = temp%10;
        temp/=10;
        d3 = temp%10;
        temp/=10;
        d4 = temp%10;
        temp/=10;
        d5 = temp%10;
        temp/=10;
        
        reverseNum = d1*10000+d2*1000+d3*100+d4*10+d5;
        
        if(reverseNum == num)
            System.out.println(num+" is a palindrome");
        else
            System.out.println(num+" is not a palindrome");
        
    }
}
