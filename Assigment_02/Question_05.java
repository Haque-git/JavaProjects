package Assigment_02;

public class Question_05 {
    public static void main(String[] args) {
        int value = 13;
        boolean is_negative = false, is_positive = false, is_even = false;
        String output = "Number is ";

        if (value > 0) {
            is_positive = true;
            if (value%2 == 0) {
                is_even = true;
            }
        }
        if (value < 0) {
            is_negative = true;
        }

        if (is_positive) {
            output += "positve ";
            if (is_even) {
                output += "and even";
            }
            else {
                output += "and odd";
            }
        }
        else if (is_negative) {
            output += "negative";
        }
        else {
            output += "zero";
        }

        System.out.println(output);
        
    }
}
