package assignment03;

public class Question_11 {
    public static void main(String[] args) {
        int number = 1673125, digit_count = 0;
        while (number > 0) {
            number /= 10;
            digit_count++;
        }
        System.out.println("Total digits = " + digit_count);
    }
}
