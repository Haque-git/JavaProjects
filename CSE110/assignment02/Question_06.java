package assignment02;

public class Question_06 {
    public static void main(String[] args) {
        int x = 10;
        if (x < 0) {
            x *= 2;
        }
        else if (x>=0 && x<2) {
            x++;
        }
        else if (x>=2 && x<5) {
            x = x*x - 1;
        }
        else {
            x = 3*x*x + 2;
        }
        System.out.println("output: " + x);
    }
}
