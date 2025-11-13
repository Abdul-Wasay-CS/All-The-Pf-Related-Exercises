import java.io.FileInputStream;
import java.util.Scanner;

public class PopulatingArraysFromFiles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int accountsData[][] = new int[4][3];

            

        try {
            FileInputStream fis = new FileInputStream("accounts.txt");
            Scanner fileScanner = new Scanner(fis);
            while(fileScanner.hasNext()){    
                for(int i=0;i<accountsData.length;i++){
                    for(int j=0;j<accountsData[i].length;j++){
                        accountsData[i][j] = fileScanner.nextInt();
                    }
                }

                for(int data[]:accountsData){
                    for(int actualData:data){
                        System.out.print(actualData+" ");
                    }
                    System.out.println();
                }
            }
        }catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

     
    }
}