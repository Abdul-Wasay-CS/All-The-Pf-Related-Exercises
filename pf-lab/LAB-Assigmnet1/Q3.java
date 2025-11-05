import java.util.*;

public class Q3
{
	public static void main(String args[])
	{

		System.out.printf("%-10s %-10s %-10s %-10s %-10s","Degrees","Radians","Sine","Cosine","Tangent");
		System.out.printf("\n---------------------------------------------------------------------");
		int degrees = 30;
		double radians = Math.toRadians(degrees);
		double sin = Math.sin(radians);
		double cos = Math.cos(radians);
		double tan = Math.tan(radians);

		System.out.printf("\n%-10d %-10.4f %-10.4f %-10.4f %-10.4f",degrees,radians,sin,cos,tan);
		
		degrees = 60;
		radians = Math.toRadians(degrees);
		sin = Math.sin(radians);
		cos = Math.cos(radians);
		tan = Math.tan(radians);

		System.out.printf("\n%-10d %-10.4f %-10.4f %-10.4f %-10.4f",degrees,radians,sin,cos,tan);

	}
}