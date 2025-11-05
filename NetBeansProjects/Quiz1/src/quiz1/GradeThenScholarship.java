package quiz1;
import java.util.Scanner;

public class GradeThenScholarship {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your Percentage:");
        int percentage = input.nextInt();
        
        //Variables to store grade and scholarship tier.
        // temporarly intiallized to zero, to avoid a runtime error.
        
        String grade="",scholarshipTier="";
        
        //validating input.
        
        if(percentage >= 0 && percentage <= 100)
        {
            if(percentage >= 85 && percentage <= 100)
            {
                grade = "A+";
                scholarshipTier = "Platinum";
            }
            else if(percentage >= 75 && percentage < 85)
            {
                grade = "A";
                scholarshipTier = "Gold";
            }
            else if(percentage >= 65 && percentage < 75)
            {
                grade = "B";
                scholarshipTier = "Silver";
            }
            else if(percentage >= 50 && percentage < 65)
            {
                grade = "C";
                scholarshipTier = "Bronze";
            }
            else
            {
                grade = "F";
                scholarshipTier = "None";
            }
            
            System.out.println("Grade: " + grade
            + " | Scholarship: " + scholarshipTier);
        }
        else
        {
            System.out.println("Invalid Percentage!");
        }
    }
}
