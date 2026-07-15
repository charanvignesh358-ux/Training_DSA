import java.util.*;

public class product {
    public static int prod(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        int prod = prod(c, d);
        System.out.println(prod);

    }
}