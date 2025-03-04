package CSE111.Assignment_01;

import java.util.Scanner;


public class Problem_03 {

    public static boolean isOneWord(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                return false;
            }
        }
        return true;
    }

    public static String nextWord(Scanner sc) {
        String str = sc.nextLine();
        while (true) {
            if (isOneWord(str)) {
                break;
            }
            System.out.println("Please enter exatcly one word");
            str = sc.nextLine();
        }
        return str;
    }

    public static int generateNumberFromWord(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                num += (int)str.charAt(i);
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                num += (int)str.charAt(i);
            }
        }
        return num;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a single word");
        String str1 = nextWord(sc);
        System.out.println("Please enter another single word");
        String str2 = nextWord(sc);


        String str3 = str1 + str2;
        System.out.println(str3);
        System.out.println(generateNumberFromWord(str3));

        sc.close();
    }
}
