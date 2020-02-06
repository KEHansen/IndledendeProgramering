package lektion7;

public class Matrix {
    public static void main(String[] args) {
        int [][] a={{1,2}, // 0. row
                {3,1}}; // 1. row
        int [][] b={{1,1,1}, // 0. row
                {1,1,1}}; // 1. row
        int[][] c;
        printmatrix(a);
        printmatrix(b);
        if (a[0].length==b.length){
            // column length in "a" is same as
            // row length in "b"
            c= multiplication(a,b);
            printmatrix(c);
        } else{
            System.out.print("matrixmultiplikation kan ikke udføres");
        }
    }

    public static void printmatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int multiplyMatrixCell(int[][] firstMatrix, int[][] secondMatrix, int row, int col) {
        int cell = 0;
        for (int i = 0; i < secondMatrix.length; i++) {
            cell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return cell;
    }

    public static int[][] multiplication(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] result = new int[firstMatrix.length][secondMatrix[0].length];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = multiplyMatrixCell(firstMatrix, secondMatrix, row, col);
            }
        }

        return result;
    }

}
