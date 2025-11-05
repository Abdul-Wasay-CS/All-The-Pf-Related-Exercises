public class EvenPrimeFactor
{
	public static void main(String args[])
	{
		long largestFactor = 2;
		long f,num = 600851475143l;

		for(long i=2; i<= (Math.sqrt(num));i++)
		{	
			
			// is a factor
			if(num%i == 0)
			{	
				f = 0;
				for( long j=2; j<= (Math.sqrt(num)); j++)
				{	
					//is a prime?
					if(i%j == 0)
					{
						f++;
						break;
					}//end of if inside inner loop

				
				}//end of inner for loop
				
				//if prime factor , add.
				
				if(f == 0)
				{
					//checks if currrent prime factor is greater than the largest prime factor.

					if(i > largestFactor)
						largestFactor = i;

				}//is a prime factor if.

			}//end of outer if


		}//end of outer for

		System.out.println("The largest factor is " + largestFactor);

	}
}