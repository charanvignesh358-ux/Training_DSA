import java.util.*;

public class diagonal {
    public static void printDiagonal(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int row = 0; row < r; row++) {
            int i = row, j = 0;
            while (i < r && j < c) {
                System.out.print(matrix[i][j] + " ");
                i++;
                j++;

            }
        }
        for (int col = 1; col < c; col++) {
            int i = 0, j = col;
            while (i < r && j < c) {
                System.out.print(matrix[i][j] + " ");
                i++;
                j++;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        printDiagonal(matrix);

    }

}