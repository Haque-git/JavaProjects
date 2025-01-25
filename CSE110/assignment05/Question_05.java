package assignment05;

import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowel_count, constant_count;
        String output = "Blimey! No Plunder!!";
        vowel_count = constant_count = 0;
        System.out.print("Enter passcode_");
        String user_input = sc.nextLine();
        for (int i = 0; i < user_input.length(); i++) {
            boolean is_vowel = (int) user_input.charAt(i) == 65 ||
                    (int) user_input.charAt(i) == 69 ||
                    (int) user_input.charAt(i) == 73 ||
                    (int) user_input.charAt(i) == 79 ||
                    (int) user_input.charAt(i) == 85 ||
                    (int) user_input.charAt(i) == 97 ||
                    (int) user_input.charAt(i) == 101 ||
                    (int) user_input.charAt(i) == 105 ||
                    (int) user_input.charAt(i) == 111 ||
                    (int) user_input.charAt(i) == 117;
            if (is_vowel) {
                vowel_count++;
                continue;
            }

            boolean is_constant = ((int) user_input.charAt(i) >= 65 && (int) user_input.charAt(i) < 91) ||
                    ((int) user_input.charAt(i) >= 97 && (int) user_input.charAt(i) < 123);
            if (is_constant) {
                constant_count++;
            }
        }

        if (constant_count != 0 && vowel_count != 0) {
            if (constant_count%5 == 0 && vowel_count%3 == 0) {
                output = "Aaarr! Me Plunder!!";
            }
            
        }

        System.out.println(output);
        sc.close();

    }
}
