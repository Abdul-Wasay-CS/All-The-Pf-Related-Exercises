import java.util.Scanner;

public class Battery
{
	public static void main(String[] args) throws InterruptedException  
	{
		Scanner input = new Scanner(System.in);

		int health = 100;
		do{

			int hit = (int)Math.random()*30+20;
			checkHealth(health);
			health = health - hit;
		}while(true);

	}//end of main
	static void displayHealth(int health)
	{
		//displays health with the scale of 2 hp = 1 bar

		System.out.print("╔");

		for(int i =1; i<=50; i++)
			System.out.print("═");
		
		System.out.print("╗");
		System.out.println();
		
		System.out.print("║");
		
		for(int i = 1; i <= health; i++)
			if( i%2 == 0)
				System.out.print("█");
		
		for(int i= 1; i<=100-health; i++)
			if( i%2 == 0)
				System.out.print(" ");
		System.out.print("║");
		
		System.out.println();
		
		System.out.print("╚");
		
		for(int i =1; i<=50; i++)
			System.out.print("═");
		
		System.out.print("╝");
		System.out.println();

	}//end of mehtod Display health

	static void checkHealth(int health) throws InterruptedException 
	{
		if(health>0)
			{
				System.out.print("Loading health");
				for(int i =1; i<=5 ; i++)
				{
					System.out.print(". ");
					Thread.sleep(650);
				}
				if(health > 40)
				{
					System.out.println();
					System.out.println("\rRemaining health: ");
					displayHealth(health);
				}
				else
				{
					System.out.println();
					System.out.println("\rHealth Critical!!!");
					System.out.println("\rRemaining Health :");
					displayHealth(health);
				}
			}
			else
			{
				System.out.print("Loading health");
				for(int i =1; i<=5 ; i++)
				{
					System.out.print(". ");
					Thread.sleep(650);
				}
				System.out.println("You have died");
				System.exit(0);
			}
	}
}