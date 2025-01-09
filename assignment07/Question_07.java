package assignment07;

import java.util.Scanner;

public class Question_07 {
    protected static void oneToN(int start_n,int n) {
        if (n < start_n)
            return;
        
        oneToN(start_n, n-1);
        System.out.print(n + " ");
    }

    protected static void nToOne(int end_n,int n) {
        if (n == 0)
            return;
        
        System.out.print(n + " ");
        oneToN(end_n,n-1);
    }

    protected static int recursiveSum(int end_n, int n) {
        if (n == end_n)
            return end_n;
        return n + recursiveSum(end_n, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        oneToN(1,sc.nextInt());
        System.out.println();
        nToOne(1,sc.nextInt());
        System.out.println();
        System.out.println(recursiveSum(1,sc.nextInt()));
        sc.close();
    }
}
