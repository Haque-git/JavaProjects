package assignment02;

public class Question_09 {
    public static void main(String[] args) {
        double value_1 = 12.3, value_2 = -23.2, value_3 = 14.78, largest_num, smallest_num;
        String out_max = "Maximum number is ", out_min = "Minimum number is ";
        if (value_1>value_2 && value_1>value_3) {
            largest_num = value_1;
        }
        else if (value_2>value_1 && value_2>value_3) {
            largest_num = value_2;
        }
        else {
            largest_num = value_3;
        }

        out_max += largest_num;

        if (value_1<value_2 && value_1<value_3) {
            smallest_num = value_1;
        }
        else if (value_2<value_1 && value_2<value_3) {
            smallest_num = value_2;
        }
        else {
            smallest_num = value_3;
        }

        out_min += smallest_num;

        System.out.println(out_max + "\n" + out_min);
    }
}
