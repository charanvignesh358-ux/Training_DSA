import java.util.*;

public class callByValue {
    public static int swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return a;

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int change = swap(a, b);
        System.out.println(change);
    }

}