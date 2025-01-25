package assignment05;

import java.util.Scanner;

public class Question_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter anything_");
        String user_input = sc.nextLine();
        String current = "";
        String output = "";
        for (int i = 0; i < user_input.length(); i++) {
            if (user_input.charAt(i) != ' ') {
                current += user_input.charAt(i);
            } else {
                current += " ";
                output = current + output;
                current = "";
            }
            

        }
        current += " ";
        output = current + output;

        System.out.println(output);

        sc.close();

    }
}
