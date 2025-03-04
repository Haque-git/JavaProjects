package CSE111_Practice.PracProbs_netlify;

import java.util.Scanner;

public class Two_dimentional_array {
    
    static int[][] create_matrix(int row, int col, Scanner sc) {
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    static void print_matrix(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] add_matrix(int[][] A, int[][] B) {
        if (A.length != B.length || A[0].length != B[0].length) {
            return null;
        } else {
            int[][] C = new int[A.length][A[0].length];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[0].length; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                }
            }
            return C;
            
        }
    }

    static int sum_of_bounbderies(int[][] A) {
        int sum = 0;
        for(int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (i == 0 || i == A.length - 1 || j == 0 || j == A[0].length - 1) {
                    sum += A[i][j];
                }
            }
        }
        return sum;
    }

    static int[][] multiply_matrix(int[][] A, int[][] B) {
        if (A[0].length != B.length) {
            return null;
        } else {
            int[][] C = new int[A.length][B[0].length];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int k = 0; k < B.length; k++) {   
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            return C;
        }
    }

    static int[][] transpose_matrix(int[][] A) {
        int[][] transposed_matrix = new int[A[0].length][A.length];
        for (int i = 0; i < transposed_matrix.length; i++) {
            for (int j = 0; j < transposed_matrix[0].length; j++) {
                transposed_matrix[i][j] = A[j][i];
            }
        }

        return transposed_matrix;
    }

    static int[] spiral_travarse(int[][] A) {
        int[] result = new int[A.length*A[0].length];
        int index = 0;
        int top, right, bottom, left;
        top = left = 0;
        bottom = A.length-1;
        right = A[0].length-1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result[index] = A[top][i];
                index++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result[index] = A[i][right];
                index++;
            }
            right--;
            
            for (int i = right; i >= left; i--) {
                result[index] = A[bottom][i];
                index++;
            }
            bottom--;
            
            for (int i = bottom; i >= top; i--) {
                result[index] = A[i][left];
                index++;
            }
            left++;
        }
        return result;
    }
}
