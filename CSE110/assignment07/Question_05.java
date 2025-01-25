package assignment07;

public class Question_05 {
    protected static void show_dots(int num) {
        for (int i = 0; i < num; i++)
            System.out.print(".");
    }

    protected static void show_palindrom(int num) {
        for (int i = 0; i < num; i++)
            System.out.print(i+1);

        for (int i = num-1; i > 0; i--)
            System.out.print(i);
    }

    protected static void show_diamond(int num) {
        for (int i = 1; i <= (num*2 - 1); i++) {
            if (i <= num) {
                show_dots(num-i);
                show_palindrom(i);
                show_dots(num-i);
                System.out.println();
            } else {
                show_dots(i-num);
                show_palindrom(num*2 - i); 
                show_dots(i-num);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        show_dots(5);
        System.out.println();
        show_palindrom(5);
        System.out.println();
        show_diamond(5);
    }
}
