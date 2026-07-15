package practise;

import java.util.*;

public class boundaryTrav {
    public static void trac(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length;
        int startCol = 0;
        int endCol = matrix[0].length;
        for (int j = startCol; j < endCol; j++) {
            System.out.print(matrix[startRow][j] + " ");
        }
        for (int i = startRow + 1; i < endRow; i++) {
            System.out.print(matrix[i][endCol - 1] + " ");
        }
        for (int j = endCol - 2; j >= startCol; j--) {
            if (startRow == endRow) {
                break;
            }
            System.out.print(matrix[endRow - 1][j] + " ");
            ;
        }
        for (int i = endRow - 2; i >= startRow + 1; i--) {
            if (startCol == endCol) {
                break;
            }
            System.out.print(matrix[i][startCol] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 } };
        trac(matrix);

    }

}
