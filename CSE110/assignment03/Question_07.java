package assignment03;

public class Question_07 {
    public static void main(String[] args) {
        int divident = 6, divisor_count = 0;
        System.out.println("Divisors of " + divident + ": ");
        for (int i = 1; i <= divident; i++) {
            if (divident%i == 0) {
                System.out.println(i);
                divisor_count++;
            }
        }
        System.out.println("Total Divisors: " + divisor_count);
        
    }
    
}
