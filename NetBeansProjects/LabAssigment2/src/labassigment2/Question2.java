package labassigment2;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers, 0 to quit: ");
        int currentNumber,previosNumber = 0, c=0;
        while(true)
        {
            currentNumber=input.nextInt();
            if(currentNumber == 0)
		break;
            if(currentNumber>previosNumber)
		c++;
            previosNumber = currentNumber;
	} 

	System.out.println("Greater count: "+(c-1));
    }
    
}
