public class snakeMatrix {

    public static void snakeM(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
        for (int j = startCol; j >= endCol; j++) {
            System.out.print(matrix[startRow][j]);
        }
        for (int j = endCol; j >= startCol; j--) {
            System.out.print(matrix[startRow + 1][j]);
        }
        for (int j = startCol; j < endCol; j++) {
            System.out.print(matrix[startRow + 2][j]);
        }
        for (int j = endCol; j >= startCol; j++) {
            System.out.print(matrix[endRow][j]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        snakeM(matrix);

    }

}
