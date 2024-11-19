package Assigment_02;

public class Question_03 {
    public static void main(String[] args) {
        int divident = 183;
        boolean is_divisible_by_5 = false;
        boolean is_divisible_by_7 = false;
        String output = "No";
        
        if (divident%5 == 0) {
            is_divisible_by_5 = true;
        }
        if (divident%7 == 0) {
            is_divisible_by_7 = true;
        }

        if (is_divisible_by_5 && is_divisible_by_7) {
            output = "Divisible by Both";
        }
        else if (is_divisible_by_5) {
            output = "Invalid: Divisible by 5 Only";
        }
        else if (is_divisible_by_7) {
            output = "Invalid: Divisible by 7 Only";
        }
        else {
            output = "No";
        }

        System.out.println(output);
        
    }
}
