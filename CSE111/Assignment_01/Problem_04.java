package CSE111.Assignment_01;

import java.util.Scanner;

public class Problem_04 {

    public static boolean inSmallCaseWord(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 'a' || str.charAt(i) > 'z') {
                return false;
            }
        }
        return true;
    }

    public static boolean isOneWord(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                return false;
            }
        }
        return true;
    }

    public static String nextWordSmalledCase(Scanner sc) {
        String str = sc.nextLine();
        while (true) {
            if (isOneWord(str) && inSmallCaseWord(str)) {
                break;
            }
            System.out.println("Please enter exatcly one word and in small case");
            str = sc.nextLine();
        }
        return str;
    }

    public static String rotateWord(String str) {
        String rotated = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                rotated += 'z';
            } else {
                rotated += (char)(str.charAt(i) - 1);
            }
        }
        return rotated;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a single word in small case");
        String str1 = nextWordSmalledCase(sc);
        System.out.println(rotateWord(str1));
        sc.close();
        
    }
}
