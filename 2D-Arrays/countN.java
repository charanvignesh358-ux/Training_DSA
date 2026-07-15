import java.util.*;

public class countN {
    public static int NumCoun(int matrix[][], int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    count++;

                } else {
                    return 0;
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int matrix[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int result = NumCoun(matrix, key);
        System.out.println("Count of " + key + " = " + result);

    }

}
