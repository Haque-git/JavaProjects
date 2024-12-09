package assignment04;

import java.util.Scanner;

public class Question_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X, Y;
        for (int i = 0; i < N; i++) {
            X = sc.nextInt();
            Y = sc.nextInt();
            for (int j = 0; j < Y; j++) {
                if (X%2 == 0) {
                    X += 1;
                }
                X += 2;
                System.out.println(X);
            }
            System.out.println(X);
        }
        sc.close();

    }
}
