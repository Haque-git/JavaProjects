package assignment03;

public class Question_15 {
    public static void main(String[] args) {
        int number = 6, sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        if (sum == number) {
            System.out.println(number + " is perfect number.");
        }
        else {
            System.out.println(number + " is not perfect number.");
        }
    }
}
