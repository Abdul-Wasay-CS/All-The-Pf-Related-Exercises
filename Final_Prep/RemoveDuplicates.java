import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates
{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length  = input.nextInt();
        
        int[] arr = new int[length];

        System.out.println("Enter the elements of the array");
        for(int i =0; i<arr.length; i++)
            arr[i] = input.nextInt();
        int[] cleanedArr = eliminateDuplicates(arr);

        for(int i : cleanedArr)
            System.out.print(i+" ");
    }

    public static int[] eliminateDuplicates(int[] list)
    {
        int[] newArr = new int[list.length];

        int uniqueIndex = 0;
        for(int i =0; i<list.length; i++)
        {
            boolean unique= true;

            for(int j=0; j<newArr.length;j++)
                if(list[i] == newArr[j])
                    unique = false;
            
            //checks if the current element is duplicate or unique

            if(unique)
            {
                newArr[uniqueIndex] = list[i];
                uniqueIndex++; 
            }
        }
        
        //for now, after all the unique items , the rest elements are zero

        int[] cleanedArr = new int[uniqueIndex];
        
        //  Creates a new Array without the extra zeros, 

        for(int i =0; i<uniqueIndex;i++)
            cleanedArr[i] = newArr[i];

        return cleanedArr;
    }
}