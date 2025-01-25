package assignment06;

import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int user_input = sc.nextInt();
        int[] arr = new int[user_input];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a number: ");
        int value = sc.nextInt();
        int index = 0;
        boolean is_found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                is_found = true;
                index = i;
                break;
            }
        }

        if (is_found) {
            System.out.println(value + " is at index " + index);
        } else {
            System.out.println("Element not found");
        }
        sc.close();

    }
}
