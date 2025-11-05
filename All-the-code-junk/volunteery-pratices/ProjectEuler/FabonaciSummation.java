public class FabonaciSummation
{
	public static void main(String args[])
	{
		int a=0, b=1 , c=0, sum=0;

		while(true)
		{
			c = a+b;
			if(c > 4000000)
				break;
			if(c%2 == 0)
				sum += c;
			//swaping values
			a = b;
			b = c;
		}
		System.out.print(sum);
	}
}