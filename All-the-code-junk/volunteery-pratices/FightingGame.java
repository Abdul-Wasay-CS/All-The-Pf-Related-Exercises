import java.util.Scanner;

public class FightingGame
{
	static Scanner input = new Scanner(System.in);
	static int bossHealth = 150,playerHealth = 100; 
	static int bossDamage = 40;
	public static void main(String[] args) throws InterruptedException  
	{
		// throwed interrupted exception because of Thread.sleep()
		System.out.print("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n");
		System.out.print("┃                Chooose an Action                           ┃\n");
		System.out.print("┃   1.Fight                                                  ┃\n");
		System.out.print("┃   2.Give up                                                ┃\n");
		System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛ \n");
		int actChoice = input.nextInt();
	

		do{

			switch(actChoice)
			{
				case 1:
					int attackChoice;
					do{
						System.out.print("Loading menu");
						for (int i=1; i<=5; i++)
						{
							System.out.print(". ");
							Thread.sleep(600);	
						}

						System.out.println();
					    
					    System.out.print("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n");
						System.out.print("┃                Chooose an Attack                           ┃\n");
						System.out.print("┃   1.UpperCut(30 damage)                                    ┃\n");
						System.out.print("┃   2.Flying Knee(40 damage)                                 ┃\n");
						System.out.print("┃   3.Spinning back kick(60 Damage)                          ┃\n");
						System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛ \n");
						
						attackChoice = input.nextInt();

						System.out.print("Processing Choice");
						for (int i =1; i<=5; i++)
						{
							System.out.print(". ");
							Thread.sleep(600);	
						}

						System.out.println();
						if(attackChoice>=1 && attackChoice<= 3)
						{	
							attackResult(attackChoice);
							checkPlayerHealth();
							checkBossHealth();
							break;
						}
						else
						{
							System.out.print("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n");
							System.out.print("┃                      Invalid Choice!                       ┃\n");
							System.out.print("┃                  Please Enter a Valid Choice.              ┃\n");
							System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n");
						}			
					}while(true);
					break;
				case 2:
					System.out.print("You Bring Shame to the KnightHood. BE GONE COWARD!!!"); 
					return;
				default:
					System.out.print("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n");
					System.out.print("┃                      Invalid Choice!                       ┃\n");
					System.out.print("┃                  Please Enter a Valid Choice.              ┃\n");
					System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n");
					continue;
			}

		}while(true);

	}//end of main
	


	static void checkBossHealth() throws InterruptedException
	{
		if(bossHealth>0)
			{
				System.out.print("Loading boss Health");
				for(int i =1; i<=5 ; i++)
				{
					System.out.print(". ");
					Thread.sleep(600);
				}
				System.out.println();
				System.out.println("\rRemaining Health :");
				displayBossHealth();
			}
		else
		{
			System.out.print("Loading health");
			for(int i =1; i<=5 ; i++)
			{
				System.out.print(". ");
				Thread.sleep(650);
			}
			System.out.println("Congratulations! You have killed the Boss!");
			for(int i=1; i<=5; i++)
			{
				System.out.print("\rDeleting the maps");
				Thread.sleep(200);
				System.out.print("\rDeleting the Players");
				Thread.sleep(200);
				System.out.print("\rEnding the Game");
				Thread.sleep(200);	
			}
			System.exit(0);
		}
	}//end of method checkBossHealth

	static void displayBossHealth() throws InterruptedException
	{
		//displays health with the scale of 2 hp = 1 bar

		System.out.print("╔");

		for(int i =1; i<=75; i++)
			System.out.print("═");
		
		System.out.print("╗");
		System.out.println();
		
		System.out.print("║");
		
		for(int i = 1; i <= bossHealth; i++)
			if( i%2 == 0)
				System.out.print("█");
		
		for(int i= 1; i<=150-bossHealth; i++)
			if( i%2 == 0)
				System.out.print(" ");
		System.out.print("║");
		
		System.out.println();
		
		System.out.print("╚");
		
		for(int i =1; i<=75; i++)
			System.out.print("═");
		
		System.out.print("╝");
		System.out.println();

	}

	static void attackResult(int attackChoice)
	{
		int damage = decideAttackDamage(attackChoice);
		int attackResult = (int)(Math.random()*failureChance(attackChoice));
		if(attackResult == 1 || attackResult == 2)
		{
			bossHealth -= damage;
		}
		else if(attackResult == 3)
		{
			playerHealth -= bossDamage;
			bossHealth -= damage;	
		}
		else
		{
			playerHealth -= bossDamage;
		}
	}//end of method attackResult

	static int failureChance(int attackChoice)
	{
		switch(attackChoice) 
		{
			case 1: return 3;
			case 2: return 5;
			case 3: return 10;
		}
		return -2;//default to avoid java from screaming
	}

	static int decideAttackDamage(int attack)
	{	

		switch(attack)
		{
			case 1: return 30;
			case 2: return 40;
			case 3: return 60;	
		}
		return -2;//default to avoid java from screaming
	}//end of method decide attack damage
	
	static void displayPlayerHealth() throws InterruptedException
	{
		//displays health with the scale of 2 hp = 1 bar

		System.out.print("╔");

		for(int i =1; i<=50; i++)
			System.out.print("═");
		
		System.out.print("╗");
		System.out.println();
		
		System.out.print("║");
		
		for(int i = 1; i <= playerHealth; i++)
			if( i%2 == 0)
				System.out.print("█");
		
		for(int i= 1; i<=100-playerHealth; i++)
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

	static void checkPlayerHealth() throws InterruptedException 
	{
		if(playerHealth>0)
			{
				System.out.print("Loading playerHealth");
				for(int i =1; i<=5 ; i++)
				{
					System.out.print(". ");
					Thread.sleep(650);
				}
				if(playerHealth > 40)
				{
					System.out.println();
					System.out.println("\rRemaining health: ");
					displayPlayerHealth();
				}
				else
				{
					System.out.println();
					System.out.println("\rHealth Critical!!!");
					System.out.println("\rRemaining Health :");
					displayPlayerHealth();
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
				System.out.println("You Lost!!");
				System.exit(0);
			}
	}
}//end of method check Health
