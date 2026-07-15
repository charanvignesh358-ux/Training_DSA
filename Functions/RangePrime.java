import java.util.*;

public class RangePrime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int fir = sc.nextInt();
        System.out.print("Enter the end number: ");
        int end = sc.nextInt();
        System.out.println("Prime number between " + fir + " and " + end);
        for (int i = fir; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }
}
