package assignment02;

public class Question_02 {
    public static void main(String[] args) {
        int score = 91;
        String grade = "";
        if (score<=100 && score>=90) {
            grade = "A";
        }
        else if (score<=98 && score>=85) {
            grade = "A-";
        }
        else if (score<=84 && score>=70) {
            grade = "B";
        }
        else if (score<=69 && score>=57) {
            grade = "C";
        }
        else if (score<=56 && score>=50) {
            grade = "D";
        }
        else if (score<=50 && score>=0) {
            grade = "F";
        }
        System.out.println("Your grade is " + grade);
    }
}
