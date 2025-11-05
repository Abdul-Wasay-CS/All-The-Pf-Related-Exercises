
package dietalexercies;
import java.util.Scanner;
public class MethodExercises19 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dimension of the square: ");
        int dim = input.nextInt();
        System.out.println("Enter the character to fill the sqaure: ");
        String userInput= input.next();
        char fillerCharacter = userInput.charAt(0);
        squareOfAsteriks(dim, fillerCharacter);
        
        input.close();
    }
    static void squareOfAsteriks( int dimension,char  fillerCharacter)
    {
        
        for(int i =1; i<= dimension; i++)
        {
            for(int j=1; j<= dimension; j++)
            {
                System.out.print(fillerCharacter);
            }
            System.out.println();
        }
        
    }
}

