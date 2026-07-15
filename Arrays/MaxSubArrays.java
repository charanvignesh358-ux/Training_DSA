import java.util.*;

public class MaxSubArrays {
    public static void maxsubArray(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];

                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.print("Max sum: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6 };
        maxsubArray(numbers);

    }

}
