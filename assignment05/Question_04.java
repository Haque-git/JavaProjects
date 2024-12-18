package assignment05;

import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter anything_");
        String user_input = sc.nextLine();
        for (int i = (user_input.length() - 1); i >= 0; i--) {
            System.out.print(user_input.charAt(i));
        }

        sc.close();

    }
}
