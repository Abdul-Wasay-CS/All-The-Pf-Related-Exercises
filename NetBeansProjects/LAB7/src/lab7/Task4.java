
package lab7;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        do{
            System.out.println("Enter the year to find its number of days: ( 2000 - 2020) ");
            year = input.nextInt();
            if(year < 2000 || year > 2020)
                System.out.println("Invalid input, please enter the year from the given range!");
        }while(year < 2000 || year > 2020);
        
        int daysInYear = numberOfDaysInAYear(year);
        System.out.println("There are " + daysInYear + " days in "+ year);
        
    }
    public static int numberOfDaysInAYear(int year)
    {
        int days;
        if(year % 4 == 0)
            days = 366;
        else
            days = 365;
        return days;
    }
}
