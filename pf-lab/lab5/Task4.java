import java.util.Scanner;

public class Task4
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		int n,count  = 0;

		int num1,num2;
		System.out.println("Enter the number of integer :");
		n = input.nextInt();
		int cmax= 0; 

		for(int i =1; i<= n ; i++)
		{
			int num = input.nextInt();

			if(num == 0)
			{
				if ( num == 0)
					cmax = count;
				count = 0; 
					
			}	
			else 
			{
				count ++;
			}
		}

		System.out.println(cmax);
						
	}
}
