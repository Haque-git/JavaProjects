package assignment04;

import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The value of N: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < (i+1); j++) {
                sum -= (j+1);
            }
        }

        System.out.println("The value of y: " + sum);
        sc.close();
    }
}
