package assignment04;
import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("enter collumn: ");
        int collumn = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collumn; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
        sc.close();
    }
}
