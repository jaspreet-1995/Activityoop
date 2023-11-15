package oop;

public class Q62 {
	public static void main(String[] args) {
        int[][] matrix1 = {{11, 12, 13}, {4, 25, 6}, {37, 78, 9}};
        int[][] matrix2 = {{9, 88, 87}, {16, 15, 4}, {3, 2, 1}};

        int[][] result = addMatrices(matrix1, matrix2);

        System.out.println("Resultant Matrix:");
        printMatrix(result);
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
