package assignment03;

public class Question_10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 40; i++) {
            if ((i%5 == 0) && (i%3 != 0))
                System.out.println(i);
        }
    }
}
