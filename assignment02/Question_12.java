package assignment02;

public class Question_12 {
    public static void main(String[] args) {
        int value_1 = 3, value_2 = 4, value_3 = 5;
        String output = "";
        if (value_1==value_2 && value_2== value_3) {
            output += "All numbers are equal";
        }
        else if (value_1==value_2 || value_2==value_3 || value_3==value_1) {
            output += "Neither all are equal or different";
        }
        else {
            output += "All numbers are different";
        }

        System.out.println(output);
    }
}
