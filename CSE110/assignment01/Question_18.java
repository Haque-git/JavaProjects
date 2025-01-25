package assignment01;
public class Question_18 {
    public static void main(String[] args) {
        int id = 24201305;
        int right_most_2_digits = (id - (id%1000000))/1000000;
        int second_last_digit = right_most_2_digits%10;
        int last_digit = (right_most_2_digits - second_last_digit)/10;
        int ans = second_last_digit*10 + last_digit;
        
        System.out.println(ans);
    }
}
