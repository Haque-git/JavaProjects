package assignment07;

import java.util.Scanner;

public class Question_01 {

    protected static boolean isEven(int num) {
        return num%2 == 0;
    }
    
    protected static void evenChecker(int num) {
        if (isEven(num)) {
            System.out.println("Even!!");
        }
        else {
            System.out.println("Odd!!");
        }
    }

    protected static boolean isPos(int num) {
        return num > 0;
    }

    protected static void sequence(int num) {
        if (isPos(num)) {
            for (int i = 0; i <= num; i++) {
                if (isEven(i)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = num; i < 0; i++) {
                if (!isEven(i)) {
                    System.out.print(i + " ");
                }
            }
        }

    }

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = sc.nextInt();
        evenChecker(value);
        System.out.print("Enter a number: ");
        System.out.println(isEven(sc.nextInt()));
        System.out.print("Enter a number: ");
        System.out.println(isPos(sc.nextInt()));
        System.out.print("Enter a number: ");
        sequence(sc.nextInt());
        sc.close();
    }
}
