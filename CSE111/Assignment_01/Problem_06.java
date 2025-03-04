package CSE111.Assignment_01;

import java.util.Scanner;

public class Problem_06 {
    public static int[] createArray(int len, Scanner sc) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        
    }
}
