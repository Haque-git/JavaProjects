package assignment06;

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int user_input = sc.nextInt();
        int[] arr = new int[user_input];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        int[] reversed_arr = new int[user_input];

        for (int i = reversed_arr.length - 1; i >= 0; i--) {
            reversed_arr[i] = arr[reversed_arr.length - i - 1];
        }



        System.out.println("Reversed using a new array: ");
        for (int i = 0; i < reversed_arr.length; i++) {
            System.out.print(reversed_arr[i] + " ");

        }

        for (int i = 0; i < arr.length/2; i++) {
            arr[i] = arr[i]^arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i]^arr[arr.length - i - 1];
            arr[i] = arr[i]^arr[arr.length - i - 1];
        }

        System.out.println("\nReversed the original array: ");
        for (int i = 0; i < reversed_arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
