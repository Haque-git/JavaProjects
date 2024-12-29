package assignment06;

import java.util.Scanner;

public class Question_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int user_input = sc.nextInt();
        double[] arr = new double[user_input];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextDouble();
        }

        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        double sum = 0;
        double average = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

            sum += arr[i];
        }

        
        int index_of_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                index_of_max = i;
                break;
            }
        }
        
        int index_of_min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                index_of_min = i;
                break;
            }
        }
        
        
        System.out.println("Maximum element " + max + " found at index " + index_of_max);
        System.out.println("Minimum element " + min + " found at index " + index_of_min);
        System.out.println("Summation: " + sum);
        average = sum / arr.length;
        System.out.println("Average: " + average);


        sc.close();
    }
}
