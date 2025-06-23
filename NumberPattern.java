import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (n): ");
        int n = sc.nextInt();

        // Print first row of 1s
        for (int i = 1; i <= n; i++) {
            System.out.print("1 ");
        }
        System.out.println();

        // Print middle rows: starting from 2 to n-1
        for (int i = 2; i < n; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= n - 2; j++) {
                System.out.print("  "); // spaces between
            }
            System.out.println("5");
        }

        
        for (int i = 1; i <= n; i++) {
            System.out.print("1 ");
        }
        System.out.println();
    }
}
