import java.util.Scanner;

    public class Pyramidattern {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter number of rows for the pyramid: ");
            int rows = sc.nextInt();
    
            for (int i = 1; i <= rows; i++) {
                
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println(); 
            }
        }
    }
    
    

