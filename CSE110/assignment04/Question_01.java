package assignment04;

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, min, avg, count, number_couunt, number;
        max = min = avg = count = 0;

        System.out.print("How many numbers do you want to enter?\n_");        
        number_couunt = sc.nextInt();

        for (int i = 0; i < number_couunt; i++) {
            System.out.print("Enter number: ");
            number = sc.nextInt();
            if (i == 0) {
                max = min = number;
            } else {
                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

                if (number > 0 && number%2 == 0) {
                    avg += number;
                    count++;
                }

                if ((i-1) == number) {
                    avg /= count;
                }
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + avg);
        sc.close();
    }
}
