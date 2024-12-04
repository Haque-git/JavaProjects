package assignment03;

public class Question_06 {
    public static void main(String[] args) {
        int output = 0, input = 5;
        for (int i = 1; i <= input; i++) {
            if (i%2 == 0) {
                output -= i*i;
            } else {
                output += i*i;
            }

        }
        System.out.println(output);
    }
}
