package assignment07;

public class Question_04 {
    protected static boolean isPrime(int num) {
        if (num == 1)
            return false;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    protected static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    protected static int special_sum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (isPrime(i) || isPerfect(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPerfect(28));
        System.out.println(special_sum(8));
    }
}
