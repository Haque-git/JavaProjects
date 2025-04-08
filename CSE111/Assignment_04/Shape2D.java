// Task: 03

package CSE111.Assignment_04;

public class Shape2D {
    //golabal variables
    String shape;
    double area;
    //square
    int side;
    //rectangle
    int length;
    int width;
    //triangle
    int base;
    int height;
    int side1;
    int side2;
    int side3;

    public Shape2D() {
        this.shape = "Square";
        this.side = 5;
        this.area = this.side * this.side;
        System.out.printf("A %s has been created with length: %d\n", this.shape, this.side);
    }
    public Shape2D(int length, int width) {
        this.shape = "Rectangle";
        this.length = length;
        this.width = width;
        this.area = this.length * this.width;
        System.out.printf("A %s has been created with length: %d and width: %d\n", this.shape, this.length, this.width);
    }
    public Shape2D(int base, int height, String shape) {
        this.shape = shape;
        this.base = base;
        this.height = height;
        this.area = 0.5 * this.base * this.height;
        System.out.printf("A %s has been created with base: %d and height: %d\n", this.shape, this.base, this.height);
    }
    public Shape2D(int side1, int side2, int side3) {
        this.shape = "Triangle";
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        double s = (this.side1 + this.side2 + this.side3) / 2.0;
        this.area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
        System.out.printf("A %s has been created with sides: %d, %d and %d\n", this.shape, this.side1, this.side2, this.side3);
    }

    public void area() {
        System.out.printf("The area of the %s is: %.2f\n", this.shape, this.area);
    }
}
