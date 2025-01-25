package assignment02;

public class Question_11 {
    public static void main(String[] args) {
        int cost = 30, paid = 520, due;
        int hundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, two = 0, one = 0;
        int returning_ammount = paid - cost;
        if (paid < cost) {
            due = cost - paid;
            System.out.println("Please pay " + due + " taka more.");
        }
        else if (paid == cost) {
            System.out.println("The return ammount is 0 taka.");
        }
        else {
            due = paid - cost;
            if (returning_ammount >= 100) {
                hundred = returning_ammount/100;
                returning_ammount %= 100;
            }
            if (returning_ammount >= 50) {
                fifty = returning_ammount/50;
                returning_ammount %= 50;
            }
            if (returning_ammount >= 20) {
                twenty = returning_ammount/20;
                returning_ammount %= 20;
            }
            if (returning_ammount >= 10) {
                ten = returning_ammount/10;
                returning_ammount %= 10;
            }
            if (returning_ammount >= 5) {
                five = returning_ammount/5;
                returning_ammount %= 5;
            }
            if (returning_ammount >= 2) {
                two = returning_ammount/2;
                returning_ammount %= 2;
            }
            if (returning_ammount > 0) {
                one = returning_ammount;
            }
            System.out.println("The return amount is " + due + " taka");
            System.out.println("100 taka note: " + hundred);
            System.out.println("50 taka note: " + fifty);
            System.out.println("20 taka note: " + twenty);
            System.out.println("10 taka note: " + ten);
            System.out.println("5 taka coin: " + five);
            System.out.println("2 taka coin: " + two);
            System.out.println("1 taka coin: " + one);
            
        }


    }
}