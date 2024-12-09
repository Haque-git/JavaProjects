package assignment04;
import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();
        System.out.println();

        int digit_count = 0, sum = 0, temp_1, temp_2;

        System.out.println("Armstrong numbers: ");
        for (int i = start; i <= end; i++) {
            temp_1 = temp_2 = i;

            while (temp_1 != 0) {
                digit_count++;
                temp_1 /= 10;
            }

            while (temp_2 != 0) {
                sum += (int)Math.pow(temp_2%10, digit_count);
                temp_2 /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
            digit_count = sum = 0;
        }

        sc.close();

    }
}
