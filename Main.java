import java.util.Arrays;
public class Main {
    static int[][] matrixSum(int[][] A, int[][] B) {
        if (A.length != B.length || A[0].length != B[0].length) {
            return new int[0][0];
        }

        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }

    static int[][] matrixProduct(int[][] A, int[][] B) {
        if (A[0].length != B.length) {
            return new int[0][0];
        }

        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[][] A = {{0, 1}, {1, 0}};
        int[][] B = {{1, 0}, {0, 1}};
        
        
        for (int i = 0; i < A.length; i++) {
            System.out.println(Arrays.toString(matrixSum(A, B)[i]));
        }


        for (int i = 0; i < A.length; i++) {
            System.out.println(Arrays.toString(matrixProduct(A, B)[i]));
        }
    }
}
