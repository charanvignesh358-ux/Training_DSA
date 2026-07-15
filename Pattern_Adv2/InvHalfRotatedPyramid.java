
public class InvHalfRotatedPyramid {
    public static void HalfPyr(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        HalfPyr(a, b);

    }

}
