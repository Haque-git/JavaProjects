package assignment04;

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int count = sc.nextInt();
        int number;
        int non_negative_number, negative_number;
        non_negative_number = negative_number = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            number = sc.nextInt();
            if (number < 0) {
                negative_number++;
            } else {
                non_negative_number++;
            }

        }

        System.out.println(non_negative_number + " Non_negative Numbers");
        System.out.println(negative_number + " Negative Numbers");
        sc.close();
    }
}
