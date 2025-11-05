
package pfassigment2;
import java.util.Scanner;
public class PFAssigment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //this will decide the number of itirations of the loop.
        System.out.println("Enter the number of students: ");
        int n = input.nextInt();
        
        //vaiables to store the values during the loop.
        
        int studentScore;
        String studentName;
        //variables to store the max score student data.
        
        int maxScore= 0;
        String maxStudentName = "";
        
        for(int i=1; i<= n; i++)
        {
            input.nextLine(); // bufferclearer , since nextInt() eats up the next .next()
            System.out.println("Enter the "+ i +" Student's name:");
            studentName = input.nextLine();
            System.out.println("Enter the "+ i +" Student's Score:");
            studentScore= input.nextInt();
            
            if(studentScore >= maxScore)
            {
                maxScore= studentScore;
                maxStudentName = studentName;
            }
        }
        System.out.printf("%s has the highest score of %d",maxStudentName,maxScore);
    }
    
}
