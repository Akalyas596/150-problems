import java.util.Scanner;

public class BinaryTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int value = (i % 2 == 0) ? 0 : 1; 
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
