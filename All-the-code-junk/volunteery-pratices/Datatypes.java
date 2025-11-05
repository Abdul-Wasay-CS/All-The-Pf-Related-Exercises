import java.util.*;

public class Datatypes
{
	public static void main(String [] args)
	{
		String name = "Bravo Six";
		int age	= 18;
		float height= 1.778f; // chatgpt, the reason you asked height in meters, i understand, but who the hell uses meters, why not just inches? this aint a physics class anyway.
		double gpa = 3.4;
		char grade = 'A';
		boolean isEnrolled = true; // hah, i wrote it as bool, and then compiler got mad on the test run.

		System.out.printf("----- Student Info Card -----");
		System.out.printf("\nName       : %s",name);
		System.out.printf("\nAge        : %d",age);
		System.out.printf("\nHeight     : %f",height);
		System.out.printf("\nGrade      : %c",grade);
		System.out.printf("\nEnorolled? : %b",isEnrolled);

	}
}