
package pfassigment2;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //this will decide the number of itirations of the loop.
        System.out.println("Enter the number of students: ");
        int n = input.nextInt();
        
        //vaiables to store the values during the loop.
        
        int studentScore;
        String studentName;
        //variables to store the max and second highest score student data.
        
        int secHighScore = 0,maxScore= 0;
        String secHighStudentName = "",maxStudentName = "";
        
        for(int i=1; i<= n; i++)
        {
            input.nextLine(); // bufferclearer , since nextInt() eats up the next .next()
            System.out.println("Enter the "+ i +" Student's name:");
            studentName = input.nextLine();
            System.out.println("Enter the "+ i +" Student's Score:");
            studentScore= input.nextInt();
            
            if(studentScore >= maxScore)
            {
                secHighScore = maxScore;
                secHighStudentName = maxStudentName;
                maxScore= studentScore;
                maxStudentName = studentName;
            }
            else if(studentScore>=secHighScore)
            {
                secHighScore = studentScore;
                secHighStudentName= studentName;
            }
            
        }
        System.out.printf("%s has the highest score with a score of %d",maxStudentName,maxScore);
        System.out.printf("\n%s has the second highest score with a score of %d",secHighStudentName,secHighScore);
    }
}
