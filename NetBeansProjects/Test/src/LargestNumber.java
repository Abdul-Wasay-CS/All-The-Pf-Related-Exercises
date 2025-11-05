import java.util.Scanner;
public class LargestNumber {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fist number:");
        int number = input.nextInt();
        int largest = number;
        for(int i=2; i<=10; i++)
        {
            System.out.println("Enter the "+i+" number:");
            number = input.nextInt();
            if(number > largest)
                largest = number;
            
        }
        System.out.println("The largest number is "+largest);
    }
}
