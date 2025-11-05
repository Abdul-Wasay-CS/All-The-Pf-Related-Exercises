
package dietalexercies;
import java.util.Scanner;
public class CalendarCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter day number: ");
        int day = input.nextInt();
        
        System.out.println("Enter year: ");
        int year = input.nextInt();
        
        String month="";
        int dayCount= 31; // 31 set as default 
        
        for(int monthNum = 1; monthNum<=12; monthNum++)
        {
            dayCount =  findDayCount(monthNum, year);
            month = findMonthName(monthNum);
            System.out.println("        "+month);
            System.out.println("========================");
            System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n","S","M","T","W","T","F","S");
            for(int s=1; s<=day; s++)
                System.out.print("   ");
            for(int d=1; d<=dayCount; d++)
            {
                System.out.printf("%3d",d);
                if((day+d)%7 == 0 )
                    System.out.println();
                
            }
            day = (dayCount+day)%7;
            System.out.println();
        }
    }
    
   
    static  int  findDayCount(int monthNum,int year)
    {
        switch(monthNum)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(year%4 == 0)
                    return 29;
                else
                    return 28;
            default:
                return 0;
        }
    }
    static String findMonthName(int monthNum)
    {
        switch(monthNum)
        {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
                
            case 4:
                return "April";
                
            case 5:
                return "May";
                
            case 6:
                return "June";
                
            case 7:
                return "July";
                
            case 8:
                return "August";
                
            case 9:
                return "September";
                
            case 10:
                return "October";
                
            case 11:
                return "November";
                
            case 12:
                return "Decmber";
            default:
                return "";
        }
    }
        
}
