import java.util.Scanner;
public class TwoLargestNumebrs {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fist number:");
        int number = input.nextInt();
        int thirdLargest = 0, secondLargest = 0, largest = number;
        for(int i=2; i<=10; i++)
        {
            System.out.println("Enter the "+i+" number:");
            number = input.nextInt();
            if(number > largest)
            {
                secondLargest = largest;
                largest = number;
                 
            }
            else if(number>secondLargest)
            {
                secondLargest = number;
            }
            else if(number > thirdLargest)
            {
                thirdLargest= number;
            }
        }
        System.out.println("The largest number is "+largest);
        System.out.println("The second largest number is "+secondLargest);
        System.out.println("The third largest number is "+thirdLargest);
    }
}
