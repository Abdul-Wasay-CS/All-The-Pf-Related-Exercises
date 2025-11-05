
package lab6;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input: ");
        String str = input.nextLine();
        
        int length = str.length();
        
        System.out.println(str.charAt(2));//line 1
        System.out.println(str.charAt(length-2));//line 2
        System.out.println(str.substring(0,5));//line 3
        System.out.println(str.substring(0,(length-2))); //line 4
        
        //line 5
        
        for(int i =0; i<length; i++)
            if(i%2==0)
                System.out.print(str.charAt(i));
        System.out.println();

        //line 6

        for(int i =1; i<length; i++)
            if(i%2!=0)
                System.out.print(str.charAt(i));
        System.out.println();
        
        //line 7
        
        for(int i=length-1;i>=0;i--)
            System.out.print(str.charAt(i));
        System.out.println();
        
        //line 8
        
        for(int i=length-1;i>=0;i-=2)
            System.out.print(str.charAt(i));
        System.out.println();
        System.out.println(length);// line 9
    }
}
