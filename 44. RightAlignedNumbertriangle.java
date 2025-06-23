import java.util.Scanner;

public class RightAlignedNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces first for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers from 1 to i
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println(); 
        }
    }
}
