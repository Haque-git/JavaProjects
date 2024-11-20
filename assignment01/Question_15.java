package assignment01;
public class Question_15 {
    public static void main(String[] args) {
        int value_1 = 12;
        int value_2 = 15;
        
        // using temporary variable

        System.out.println("Before swaping value_1 = " + value_1 + " and value_2 = " + value_2);

        int temp = value_1;
        value_1 = value_2;
        value_2 = temp;
        
        System.out.println("After swaping value_1 = " + value_1 + " and value_2 = " + value_2);

        // without using temporary variable

        System.out.println("Before swaping value_1 = " + value_1 + " and value_2 = " + value_2);

        value_1 += value_2;
        value_2 = value_1 - value_2;
        value_1 -= value_2;

        System.out.println("After swaping value_1 = " + value_1 + " and value_2 = " + value_2);



    }
}
