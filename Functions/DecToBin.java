public class DecToBin {
    public static int decToBin(int Bin) {
        int bin = 0;
        int pow = 0;

        while (Bin > 0) { // ✅ check input number
            int lastDigit = Bin % 2; // ✅ get remainder first
            bin = bin + (lastDigit * (int) Math.pow(10, pow)); // ✅ use pow correctly
            pow++;
            Bin = Bin / 2; // ✅ divide original number
        }
        return bin;
    }

    public static void main(String[] args) {
        System.out.println(decToBin(5)); // Output: 101
    }
}
