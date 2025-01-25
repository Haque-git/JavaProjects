package assignment04;

import java.util.Scanner;

public class Question_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, divisor_count = 0;
        while (true) {
            System.out.print("Enter Number: ");
            number = sc.nextInt();
            if (number < 1) {
                System.out.println("Please enter positive number");
                continue;
            } else if (number%2 == 1) {
                break;
            }
            for (int i = 1; i <= number; i++) {
                if (number%i == 0) {
                    divisor_count++;
                }
            }
            System.out.println(number + " has " + divisor_count + " divisors");
            divisor_count = 0;   
            
        }
        sc.close();

    }
}
