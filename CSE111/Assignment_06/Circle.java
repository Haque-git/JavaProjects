// task: 6.4

package CSE111.Assignment_06;

public class Circle {
    static int count;
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
        Circle.count++;
    }

    public double getRadius() {
        return radius;
    }
    public double area() {
        return area;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }
}
