import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Choose a pattern to print (1-5): ");
            System.out.println("1) Rectangle");
            System.out.println("2) Left Triangle");
            System.out.println("3) Right Triangle");
            System.out.println("4) Pyramid");
            System.out.println("5) Number Pyramid");
            int option = input.nextInt();

            System.out.print("Enter number of rows: ");
            int n = input.nextInt();

            switch (option) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n * 3; j++) // wider rectangle
                            System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 2:
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 3:
                    for (int i = 1; i <= n; i++) {
                        for (int j = i; j < n; j++)
                            System.out.print(" ");
                        for (int k = 1; k <= i; k++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 4:
                    for (int i = 1; i <= n; i++) {
                        for (int j = i; j < n; j++)
                            System.out.print(" ");
                        for (int k = 1; k <= 2 * i - 1; k++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 5:
                    for (int i = 1; i <= n; i++) {
                        for (int j = i; j < n; j++)
                            System.out.print(" ");
                        for (int k = 1; k <= 2 * i - 1; k++)
                            System.out.print(i);
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to print another pattern? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
    }
}
