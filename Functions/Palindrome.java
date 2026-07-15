import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(int n) {
        if (n < 0)
            return false; // negative numbers are not palindromes

        int orig = n;
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }

        if (orig == rev) {
            System.out.println("Number is Palindromic: " + orig);
            return true;
        } else {
            System.out.println("Not a Palindromic number: " + orig);
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPalindrome(n);
    }
}
