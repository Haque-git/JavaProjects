package assignment03;

public class Question_08 {
    public static void main(String[] args) {
        int term = 10, odd_multiples = 1, sum = 0;
        System.out.println("The odd numbers are:  ");
        for (int i = 1; i <= term; i++) {
            System.out.println(odd_multiples);
            sum += odd_multiples;
            odd_multiples += 2;
        }
        System.out.println("The Sum of odd Natural Numbers up to " + term + " terms is: " + sum);

    }
}
