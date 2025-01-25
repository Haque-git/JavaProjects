package assignment06;

import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int user_input = sc.nextInt();
        int[] arr = new int[user_input];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }    
        }
        
        System.out.println("\nAfter modifying: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}
