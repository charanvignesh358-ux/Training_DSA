public class revArray {
    public static void reverseK(int numbers[], int k) {
        int first = 0, last = numbers.length - 1;
        int count = 0;

        while (first < last && count < k) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
            count++;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 11, 12 };
        int k = 2;
        reverseK(numbers, k);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
