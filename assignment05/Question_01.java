package assignment05;

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write anything_");
        String user_input = sc.nextLine();
        String modified_text = "";
        for (int i = 0; i < user_input.length(); i++) {
            if (user_input.charAt(i) >= 97 && user_input.charAt(i) <= 122) {
                modified_text += (char) (user_input.charAt(i) - 32);
                
            } else {
                modified_text += user_input.charAt(i);
            }
        }
        System.out.println("All lowercas letter has been changed to uppercase");
        System.out.println("Output: " + modified_text);
        sc.close();
    }
}
