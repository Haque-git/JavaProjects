package assignment02;

public class Question_15 {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int sum = 0;
        double average;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        average = sum / (end - start + 1);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
