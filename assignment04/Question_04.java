package assignment04;

import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many prime numbers you wanna find out?\n_");
        int prime_count = sc.nextInt();
        boolean is_prime;
        int prime_found = 0;

        for (int i = 2; prime_found != prime_count; i++) {
            is_prime = true;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    is_prime = false;
                    break;
                }
            }

            if (is_prime) {
                System.out.println(i);
                prime_found++;
            }

        }
        sc.close();

    }
}
