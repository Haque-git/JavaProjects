package assignment03;

public class Question_02 {
    public static void main(String[] args) {
        for (int i = 18; i <= 63; i += 9) {
            if (i%2 != 0) {
                System.out.print(i*(-1));    
            }
            else {
                System.out.print(i);    
            }
            if (i != 63) {
                System.out.print(", ");    
            }

        }
    }
}
