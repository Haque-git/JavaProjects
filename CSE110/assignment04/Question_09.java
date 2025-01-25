package assignment04;
import java.util.Scanner;

public class Question_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side lenght: ");
        int side_lenght = sc.nextInt();

        for (int i = 1; i <= side_lenght; i++) {
            for (int j = 1; j <= (side_lenght - i); j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                
            }

            System.out.println();
        }
        sc.close();

    }
}
