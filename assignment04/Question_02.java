package assignment04;

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Enter number: ");
            num = sc.nextInt();
            if (num < 0) {
                break;
            }
            System.out.println(num + " ^ 2: " + (int)Math.pow(num, 2));
        }
        sc.close();
    }
}
