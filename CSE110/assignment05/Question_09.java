package assignment05;

import java.util.Scanner;

public class Question_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password_");
        String password = sc.nextLine();
        int strength = 0;
        if (password.length() >= 8) {
            strength++;
        }

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                strength++;
                break;
            }
        }

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                strength++;
                break;
            }
        }

        for (int i = 0; i < password.length(); i++) {
            if ((password.charAt(i) >= 48 && password.charAt(i) <= 57)) {
                strength++;
                break;
            }
        }

        for (int i = 0; i < password.length(); i++) {
            if (((int) password.charAt(i) >= 33 && (int) password.charAt(i) <= 47) ||
                    ((int) password.charAt(i) >= 58 && (int) password.charAt(i) <= 64) ||
                    ((int) password.charAt(i) >= 91 && (int) password.charAt(i) <= 96) ||
                    ((int) password.charAt(i) >= 123 && (int) password.charAt(i) <= 126)) {
                strength++;
                break;
            }
        }

        if (strength == 5) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();
    }
}
