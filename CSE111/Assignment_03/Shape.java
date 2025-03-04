// Task_02

package CSE111.Assignment_03;

public class Shape {
    public String name;
    public double radius;
    public int height_tri;
    public int base;
    public double height_rec;
    public double width;
    public double area;

    public void setParameters(String name, double radius) {
        this.name = name;
        if (this.name.equals("Circle")){
            this.radius = radius;
            this.area = Math.PI * Math.pow(radius, 2);
            
        } else {
            System.out.println("Invalid Shape Name");
        }
    }

    public void setParameters(String name, int height, int base) {
        this.name = name;
        if (this.name.equals("Triangle")){
            this.height_tri = height;
            this.base = base;
            this.area = 0.5 * height * base;
        } else {
            System.out.println("Invalid Shape Name");
        } 
    }

    public void setParameters(String name, double height, double width) {
        this.name = name;
        if (this.name.equals("Rectangle")){
            this.height_rec = height;
            this.width = width;
            this.area = height * width;
        } else {
            System.out.println("Invalid Shape Name");
        }
    }

    public String details() {
        return "Shape: " + this.name + "\nArea: " + this.area;
    }
    
}
