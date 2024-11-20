package assignment02;

public class Question_08 {
    public static void main(String[] args) {
        boolean is_adult = false;
        int age = 24, payment = 120000, tax = 0;
        String output = "Your tax amount is ";
        if (age > 18) {
            is_adult = true;
        }

        if (is_adult) {
            if (payment>=10000 && payment<=20000) {
                tax += (payment*5)/100;
            }
            else if (payment > 20000) {
                tax += (payment*10)/100;
            }
        }

        output+= (tax + " TK");

        System.out.println(output);

    }
}
