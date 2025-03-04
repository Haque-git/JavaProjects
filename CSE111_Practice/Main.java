package CSE111_Practice;

public class Main {
    public static void main(String[] args) {
        
        int[][] A = {{0, 1}, {1,0}};
        int[][] B = {{0, 1}, {1,0}};

        Matrix.printMatrix(Matrix.multiplyMatrix(A, B));
    }
}
