package assignment06;

import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of the array 1: ");
        int length_of_arr_01 = sc.nextInt();
        int[] arr_01 = new int[length_of_arr_01];
        
        System.out.println("Please enter the elements of the array 1: ");
        for (int i = 0; i < arr_01.length; i++) {
            arr_01[i] = sc.nextInt();
        }
        
        
        System.out.print("Please enter the length of the array 2: ");
        int length_of_arr_02 = sc.nextInt();
        int[] arr_02 = new int[length_of_arr_02];
        
        System.out.println("Please enter the elements of the array 2: ");
        for (int i = 0; i < arr_02.length; i++) {
            arr_02[i] = sc.nextInt();
        }

        
        boolean is_subset = true;
        for (int i = 0; i < arr_02.length; i++) {
            boolean is_found = false;
            for (int j = 0; j < arr_01.length; j++) {
                if (arr_02[i] == arr_01[j]) {
                    is_found = true;
                    break;
                }
            }
            if (!is_found) {
                is_subset = false;
                break;
            }
        }

        if (is_subset) {
            System.out.println("Array 2 is a subset of the array 1.");
        } else {
            System.out.println("Array 2 is not a subset of the array 1.");
        }

        sc.close();

    }
}
