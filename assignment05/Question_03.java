package assignment05;

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter anything_");
        String user_input = sc.nextLine();
        String splitter;
        System.out.print("Enter \"Character\" as splitter_");
        while (true) {
            splitter = sc.nextLine();
            if (splitter.length() == 1) {
                break;
            } else {
                System.out.print("Please enter single \"Character\"_");
            }
        }

        for (int i = 0; i < user_input.length(); i++) {
            if ((int)user_input.charAt(i) == (int)splitter.charAt(0)) {
                System.out.println();
            } else {
                System.out.print(user_input.charAt(i));
            }
        }

        sc.close();

    }
}
