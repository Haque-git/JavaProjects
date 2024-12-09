package assignment04;
import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < (height-i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((2*i) -1); j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }        
        sc.close();
    }
}
