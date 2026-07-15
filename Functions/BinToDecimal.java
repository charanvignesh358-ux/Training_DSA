public class BinToDecimal {
    public static int binToDec(int bin) {
        int decNum = 0;
        int pow = 0;

        while (bin > 0) {
            int lastDigit = bin % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            bin = bin / 10;
        }
        return decNum;

    }

    public static void main(String[] args) {
        System.out.println(binToDec(101));

    }

}
