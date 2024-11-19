package Assigment_02;

public class Question_04 {
    public static void main(String[] args) {
        int year = 2521;
        boolean is_divisible_by_4 = false, is_divisible_by_100 = false, is_divisible_by_400 = false;
        String output = year + " is not a leap year";

        if (year%4 == 0) {
            is_divisible_by_4 = true;
        }
        if (year%100 == 0) {
            is_divisible_by_100 = true;
        }
        if (year%400 == 0) {
            is_divisible_by_400 = true;
        }

        if (is_divisible_by_4) {
            if (!is_divisible_by_100) {
                output = year + " is a leap year";
            }
            else if (is_divisible_by_100 && is_divisible_by_400) {
                output = year + " is a leap year";
            }
        }

        System.out.println(output);
    }
}
