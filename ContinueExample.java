import java.util.*;

public class ContinueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (multiples of 10 will be skipped. Press Ctrl+C to stop):");
        
        while (true) {
            System.out.print("Enter a number: ");
            if (!sc.hasNextInt()) {
                break; // Exit if the user inputs a non-integer
            }
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("-> Multiple of 10 skipped using 'continue'!");
                continue; // Skip the rest of the loop iteration
            }
            System.out.println("-> You entered: " + n);
        }
        sc.close();
    }
}
