package assignment06;

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int user_input = sc.nextInt();
        int[] arr = new int[user_input];
        int[] resized_arr = new int[user_input + 1];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < resized_arr.length; i++) {
            if (i != resized_arr.length-1) {
                resized_arr[i] = arr[i];
            } else {
                System.out.print("Enter another number: ");
                resized_arr[i] = sc.nextInt();
            }
        }

        System.out.println("The element of the array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }

        System.out.println("After resizing the array: ");
        for (int i = 0; i < resized_arr.length; i++) {
            System.out.print(resized_arr[i] + " ");
        }

        sc.close();


    }
}
