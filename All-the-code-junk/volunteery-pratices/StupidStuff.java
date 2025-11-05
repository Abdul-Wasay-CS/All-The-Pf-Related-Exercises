import java.util.Scanner;

public class StupidStuff{
	public static void main(String[] args) {
		
		for(int i =1; i<= 500;i++)
		{
			for(int j = 1; j<= 500; j++)
			{
				for(int k = 1; k<= 500; k++)
				{
					if(i*i + j*j == k*k)
					{
						System.out.printf("%-15d %-15d %-15d",i, j , k);
						System.out.println();
					}
					else if(i*i + k*k== j*j)
					{
						System.out.printf("%-15d %-15d %-15d",i, j , k);
						System.out.println();
					}
					else if(k*k + j*j == i*i)
					{
						System.out.printf("%-15d %-15d %-15d",i, j , k);
						System.out.println();
					}
				}
			}
		}	
	}
}