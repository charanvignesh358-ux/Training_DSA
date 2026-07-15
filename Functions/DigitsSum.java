import java.util.*;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int digits = sc.nextInt();
        System.out.println("Sum of Digits is: " + sumOfDigits(digits));

    }

    public static int sumOfDigits(int n) {
        int DigitSum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            DigitSum += lastDigit;
            n /= 10;

        }
        return DigitSum;

    }
}