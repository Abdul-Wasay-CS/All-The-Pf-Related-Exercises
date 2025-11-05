import java.import.*;

public class GradeClassifier
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);

		int marks = console.nextInt();

		if(marks > 0 )
		{
			if(marks<100)
			{
				if(marks>40)
				{
					if(marks>=50)
					{

					}
					else
					{
						System.out.println("")
					}
				}
				else
				{
					System.out.println("F Grade!");
				}
				
			}	
			else
			{
				System.out.println("Invalid!");
			}	
			
			
		}
		else
		{
			System.out.println("Invalid input!");
		}
	}
}