package CSE111.Assignment_01;

import java.util.Scanner;

public class Problem_05 {

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of length");
        int len = sc.nextInt();
        int[] arr = createArray(len, sc);
        
        for (int i = 0; i < arr.length/2; i++) {
            arr[i] = arr[i]^arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i]^arr[arr.length-i-1];
            arr[i] = arr[i]^arr[arr.length-i-1];
        }

        printArray(arr);
        sc.close();
    }
}
