import java.util.Scanner;
package missedtasks;

public class MissedTasks {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int patternChoice;
        System.out.println("Select a pattern: \n1.Square of Asterik"
                + "\n2.Left Aligned Triangle\n3.Right aligned Triangle"
                + "\n4.Pyramid of Astericks\n5.Pyramid of numbers");
        System.out.println("Enter The pattern number you want to print:");
        patternChoice = input.nextInt();
        
        switch(patternChoice)
        {
            case 1:
                for(int i = 1; i<=4; i++)
                {
                    for(int j=1; j<=10; j++)
                        System.out.print("*");
                    System.out.println();
                }
                break;
            case 2:
                for(int i =1; i<=5 ; i++)
                {
                    for(int j= 1; j<=i ; j++)
                        System.out.print("*");
                    System.out.println();
                }
            case 3:
                for(int i = 1; i<=5; i++)
                {
                    for(int j = i; j< 5; j++)
                    {
                        System.out.print(" ");
                    }
                    for(int s = 1; k< i; k++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                    break;
                }
            case 4:
                for(int i = 1; i<=5; i++)
                {
                    for(int j =5 ; j> i; j--)
                        System.out.print(" ");
                    for(int k = 1; k<=i; k++)
                        System.out.print("*");
                    for(int f = 1; f<=i-1;f++)
                        System.out.print("*");
                    System.out.println();
                }
                break;
            case 5:
                for(int i = 1; i<=5; i++)
                {
                    for(int j =5 ; j> i; j--)
                        System.out.print(" ");
                    for(int k = 1; k<=i; k++)
                        System.out.print(i);
                    for(int f = 1; f<=i-1;f++)
                        System.out.print(i);
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
    }
    
}
