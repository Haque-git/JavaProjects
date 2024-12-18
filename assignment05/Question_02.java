package assignment05;

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter anything_");
        String user_input = sc.nextLine();
        String input_reversed = "";
        boolean is_palindrome;
        for (int i = (user_input.length() -1); i >= 0; i--) {
            input_reversed += user_input.charAt(i);
        }

        is_palindrome = (user_input.equals(input_reversed));
        System.out.println(is_palindrome);
        sc.close();
        
    }
}
