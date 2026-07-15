import java.util.*;

public class maxSubPrefix {
    public static void prefix(int numbers[]) {
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                curSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                if (maxSum < curSum) {
                    maxSum = curSum;
                }

            }
        }
        System.out.println("max Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        prefix(arr);

    }

}
