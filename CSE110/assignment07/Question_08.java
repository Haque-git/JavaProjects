package assignment07;

public class Question_08 {
    protected static void reverseDigits(int n) {
        if (n == 0)
            return;

        System.out.print(n%10 + " ");
        reverseDigits(n/10);
    }

    public static void main(String[] args) {
        reverseDigits(1234);
    }
}
