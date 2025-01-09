public class ass {


    public static boolean is_prime(int num) {
        if (num == 1)
            return false;

        boolean result = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(is_prime(3));
    }
}