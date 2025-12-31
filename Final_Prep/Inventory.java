import java.util.Scanner;
import java.util.Arrays;
public class Inventory 
{


    static String[] uid = {
                        "A101",
                        "B202",
                        "C303",
                        "D404",
                        "E505",
                        "F606"
                    };

    static int[] quantity = {
                        50,
                        60,
                        70,
                        28,
                        40,
                        80
                    };

    static Scanner input =new Scanner(System.in);

    public static void main(String[] args) {


        boolean repeat = true;

        while(repeat)
        {
            System.out.println("Please Choose An Option (1-Search, 2-Update,3-Print, 4-Exit): ");
            int choice = input.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter the Item Id: ");
                    String id = input.next();

                    findItem(id);
                    break;

                case 2:
                    System.out.println("Enter An item: ");
                    String itemId = input.next();
                    updateQuantity(itemId);
                    break;
                case 3:
                    listAllItems();
                    break;
                case 4:
                    repeat = false;
                    break;
                default: 
                    System.out.println("Please Choose a valid Option");
            }// switch
        }// while
    }//main

    public static void findItem(String id)
    {
        boolean found = false;
        int foundIndex = 0;
        for(int i=0; i<uid.length; i++)
            if(uid[i].equalsIgnoreCase(id))
            {
                found = true;
                foundIndex = i;
            }

        if(found)
            System.out.println("Item Found: "+uid[foundIndex]+", Quantity: "+quantity[foundIndex]);
        else
            System.out.println("Item not found");
    }

    public static void updateQuantity(String id)
    {
        int index = findItemIndex(id);

        if(index>=0)
        {
            System.out.println("Enter the new Quantity: ");
            int newQuan = input.nextInt();
            if(newQuan >= 0)
            {
                quantity[index] = newQuan;
                System.out.println("Update successful");
            }
            else
                System.out.println("Invalid Quantity");
        }
        else
        {
            System.out.println("Item Not Found");
        }

    }

    public static void listAllItems()
    {
        for(int i =0; i<uid.length;i++)
            System.out.println("Item: "+uid[i]+", Quantity: "+quantity[i]);
    }

    public static int findItemIndex(String idw)
    {
        boolean found = false;
        int foundIndex = 0;
        for(int i=0; i<uid.length; i++)
            if(uid[i].equalsIgnoreCase(id))
            {
                found = true;
                foundIndex = i;
            }

        if(found)
            return foundIndex;
        else
            return -1;
    }
}//class
