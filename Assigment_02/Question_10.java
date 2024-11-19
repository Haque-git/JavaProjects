package Assigment_02;

public class Question_10 {
    public static void main(String[] args) {
        int side_1 = 3, side_2 = 4, side_3 = 5;
        String output = "This is a ";
        if (side_1==side_2 && side_2== side_3 && side_3==side_1) {
            output += "Equilateral triangle";
        }
        else if (side_1==side_2 || side_2==side_3 || side_3==side_1) {
            output += "Isosceles triangle";
        }
        else {
            output += "Scalene triangle";
        }

        System.out.println(output);
    }
}
