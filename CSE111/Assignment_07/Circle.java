package CSE111.Assignment_07;

public class Circle extends Shape {
    public double radius;

    public void area() {
        double area = Math.PI * radius * radius;
        System.out.printf("Area of %s Circle: %.2f\n", super.color, area);
    }
}
