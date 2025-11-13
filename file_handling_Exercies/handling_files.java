import java.io.*;
import java.util.Scanner;
public class handling_files{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // putting data into the array
        int accountsData[][] = { {101,3050,1500},
                                 {102,2000,2500},
                                 {103,4500,5500},
                                 {104,6000,3500} };

        // writing data to the file
        try {
            FileOutputStream fos = new FileOutputStream("accounts.txt");

            PrintStream ps = new PrintStream(fos);

            for(int i=0; i<accountsData.length; i++){
                for(int j=0; j<accountsData[i].length; j++){
                    ps.print(accountsData[i][j]+" ");
                }
                ps.println();
            }

            //reading data from the file

            FileInputStream fis = new FileInputStream("accounts.txt");
            Scanner fileScanner = new Scanner(fis);

            while(fileScanner.hasNext()){
                int accountNumber = fileScanner.nextInt();
                int balance = fileScanner.nextInt();
                int withdrawAmount = fileScanner.nextInt();

                System.out.println("Account Number: " + accountNumber);
                System.out.println("Balance: " + balance);
                System.out.println("Withdraw Amount: " + withdrawAmount);
                System.out.println("---------------------------");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
       
    }
} 