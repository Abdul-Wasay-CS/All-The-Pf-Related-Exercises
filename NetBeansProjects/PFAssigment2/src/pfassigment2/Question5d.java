package pfassigment2;

public class Question5d
{
    public static void main(String[] args) 
    {
        for(int i = 1; i<=6 ; i++)
        {
            for(int j = 1; j<=i-1; j++)
                System.out.print("  ");
            for(int k=1; k<=7-i; k++)
                System.out.printf("%2d",k);    
            
            System.out.println();
        }
    }
}
