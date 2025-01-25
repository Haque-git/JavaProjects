package assignment02;

public class Question_01 {
    public static void main(String[] args) {
        int value_01 = 100, value_02 = 101, value_03 = 110;
        int largest_value;
        if (value_01 > value_02 && value_01>value_03) {
            largest_value = value_01;
        }
        else if (value_02>value_01 && value_02>value_03) {
            largest_value = value_02;
        }
        else {
            largest_value = value_03;
        }

        System.out.println("largest number: " + largest_value);
    }
}
