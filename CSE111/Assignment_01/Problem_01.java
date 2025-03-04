package CSE111.Assignment_01;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        
        
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if (n>0 && n%2==1) {
                sum += n;
                count++;
                if (n>max) {
                    max = n;
                }
                if (n<min) {
                    min = n;
                }

            }

        }
        
        
        if (count == 0) {
            System.out.println("No odd positive number found");
        } else {
            System.out.println("Sum: " + sum);
            System.out.println("Maximum: " + (int)max);
            System.out.println("Minimum: " + (int)min);
            System.out.println("Average: " + ((double)sum/count)); 
        }

        sc.close();
    }
}
