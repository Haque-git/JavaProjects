package assignment01;
public class Question_20 {
    public static void main(String[] args) {
        double a = 4.5;
        double b = 9.5;
        double c = Math.sqrt(a*a + b*b);
        double sinA = a/c;
        double cosA = b/c;
        double sinB = cosA;
        double cosB = sinA;

        System.out.println("sin(A) = " + sinA + ", cos(A) = " + cosA + ", sin(B) = " + sinB + ", cos(B) = " + cosB);
    }
}
