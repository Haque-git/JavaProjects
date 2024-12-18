package assignment05;

import java.util.Scanner;

public class Question_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string_");
        String str_1 = sc.nextLine();
        System.out.print("Enter second string_");
        String str_2 = sc.nextLine();

        String output = "";

        for (int i = 0; i < str_1.length(); i++) {
            boolean is_unique = true;
            for (int j = 0; j < str_2.length(); j++) {
                if (str_1.charAt(i) == str_2.charAt(j)) {
                    is_unique = false;
                    
                    break;
                }
            }
            if (is_unique) {
                output += str_1.charAt(i);
            }
        }

        for (int i = 0; i < str_2.length(); i++) {
            boolean is_unique = true;
            for (int j = 0; j < str_1.length(); j++) {
                if (str_2.charAt(i) == str_1.charAt(j)) {
                    is_unique = false;
                    break;
                }
            }
            if (is_unique) {
                output += str_2.charAt(i);
            }
        }

        String output_uppercase = "";

        for (int i = 0; i < output.length(); i++) {
            if ((int) output.charAt(i) >= 97 && (int) output.charAt(i) <= 122) {
                output_uppercase += (char) (output.charAt(i) - 32);
            } else {
                output_uppercase += output.charAt(i);
            }
        }

        System.out.println(output_uppercase);

        sc.close();

    }
}
