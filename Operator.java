import java.util.*;

public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("a Equals to b");
        } else if (a > b) {
            System.out.println("a is grater than b");
        } else {
            System.out.println("a is Less than b");
        }

    }

}
