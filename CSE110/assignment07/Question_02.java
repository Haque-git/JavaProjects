package assignment07;

import java.util.Scanner;

public class Question_02 {


    protected static double circleArea(int radius) {
        return Math.PI*Math.pow(radius, 2);
    }


    protected static double phereVolume(int radius) {
        return (4/3)*Math.PI*Math.pow(radius, 3);
    }


    protected static void findSpace(int radius, String shape) {
        switch (shape) {
            case "circle":
                System.out.println(circleArea(radius));
                break;

            case "sphere":
                System.out.println(phereVolume(radius));
                break;

            default:
                System.out.println("Wrong parameter");
                break;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        System.out.println("The area of the circle is: " + circleArea(sc.nextInt()));
        System.out.print("Enter radius: ");
        System.out.println("The volume of the sphere is: " + phereVolume(sc.nextInt()));
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        System.out.print("Enter shape: ");
        String shape = sc.next();
        findSpace(radius, shape);
        sc.close();
    }
}
