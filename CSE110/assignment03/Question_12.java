package assignment03;

public class Question_12 {
    public static void main(String[] args) {
        int number = 1673125;
        while (number > 0) {
            if (number/10 == 0) {
                System.out.print((number % 10));    
            }
            else {
                System.out.print((number % 10) + ", ");
            }
            number /= 10;
        }
    }
}
