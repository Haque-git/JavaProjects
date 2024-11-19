package Assigment_02;

public class Question_07 {
    public static void main(String[] args) {
        int id = 24201305, year = 0, session = 0;
        String output = "Student Joined BRAC in ", str_session ="";

        year = id/1000000;
        session = (id/100000)%10;
        if (session == 1) {
            str_session = "Spring ";
        }
        else if (session == 3) {
            str_session = "Summer ";
        }
        else if (session == 2) {
            str_session = "Fall ";
        }
        
        output += (str_session + year);
        System.out.println(output);
    }
}
