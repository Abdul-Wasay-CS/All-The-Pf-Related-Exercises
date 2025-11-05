import java.util.*;

public class MessOfDatatypes
{
	public static void main(String args[])
	{
		int numInt = 7;
		double numDouble = 2.5;
		char wordChar = 'A';

		System.out.printf("\n%d / 2 = %d",numInt,numInt/2);
		System.out.printf("\n%d / %.2f = %.2f",numInt,numDouble, numInt/numDouble);
		System.out.printf("\n(int) %.2f = %d",numDouble,(int)numDouble);
		System.out.printf("\n%c + %d = %d",wordChar,numInt,wordChar+numInt);
		System.out.printf("\n(char)( %c + %d ) = %c",wordChar,numInt, (char)(numInt+wordChar));

	}
}