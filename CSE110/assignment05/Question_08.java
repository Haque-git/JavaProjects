package assignment05;

import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter anything_");       
        String user_input = sc.nextLine();
        String output = "";

        int count = 1;

        for (int i = 0; i < user_input.length(); i++) {
            if ((user_input.charAt(i) >= 65 && user_input.charAt(i) <= 90)
                    || (user_input.charAt(i) >= 97 && user_input.charAt(i) <= 122)) {
                

                if (count%2 == 1) {
                    if (user_input.charAt(i) >= 65 && user_input.charAt(i) <= 90) {
                        output += (char) (user_input.charAt(i) + 32);
                        
                    } else {
                        output += user_input.charAt(i);
                    }
                } else {
                    if (user_input.charAt(i) >= 97 && user_input.charAt(i) <= 122) {
                        output += (char) (user_input.charAt(i) - 32);
                        
                    } else {
                        output += user_input.charAt(i);
                    }
                }

                count++;
            }

            else {
                output += user_input.charAt(i);
            }

            if (user_input.charAt(i) == '.') {
                count++;
            }
        }

        System.out.println(output);

        sc.close();

    }
}
