package assignment07;

import java.util.Scanner;

public class question_06 {
    protected static double calcTask(int age,  int salary) {
        if (age <18 || salary < 10000)
            return 0;
        if (salary >= 10000 && salary <= 20000)
            return (salary*7)/100;
        return (salary*14)/100;
    }

    protected static void calcYearlyTax() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        for (int i = 0; i < 12; i++) {
            System.out.println("Enter your salary: ");
            System.out.println(calcTask(age, sc.nextInt()));
        }
        sc.close();
    }

    public static void main(String[] args) {
        System.out.println(calcTask(20,18000));
        calcYearlyTax();
    }
}
