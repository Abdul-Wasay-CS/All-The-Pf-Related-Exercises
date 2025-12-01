public class CommandLineAurgements
{
	public static void main(String[] args) {
		if(args.length == 0)
		{
			System.out.print("Error: Invalid number of aurguments Recieved,\n"
				+"Enter one or more Aurguements to continue");
		}
		else
		{
			int num = Integer.parseInt( args[0] );
			int[] size = new int[num];

			System.out.print("Good job, heres your CLI aurguments:"+(Integer.parseInt(args[1])));
		}
	}
}