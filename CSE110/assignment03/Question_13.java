package assignment03;

public class Question_13 {
    public static void main(String[] args) {
        int number = 1673125, initial_number = number;
        int digit_count = 0;
        while (initial_number > 0) {
            initial_number /= 10;
            digit_count++;
        }

        int exp = 1;
        for (int i = 1; i < digit_count; i++) {
            exp *=10;
        }

        while (number > 0) {
            if (number/10 == 0) {
                System.out.println((number/exp));                
            }
            else {
                System.out.print((number/exp) + ", ");                
            }
            number %= exp;
            exp /= 10;
        }
    }
}
