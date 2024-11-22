package assignment03;
public class Question_14 {
    public static void main(String[] args) {
        int random_int = 7;
        int count = 0;
        for (int i = 1; i <= random_int; i++) {
            if (random_int%i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(random_int + " is prime number");
        }
        else {
            System.out.println(random_int + " is not prime number");
        }
    }
}
