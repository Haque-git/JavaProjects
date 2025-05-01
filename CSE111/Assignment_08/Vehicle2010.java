package CSE111.Assignment_08;

public class Vehicle2010 extends Vehicle {
    
    public void moveLowerLeft() {
        super.moveDown();
        super.moveLeft();
    }

    public void moveLowerRight() {
        super.moveDown();
        super.moveRight();
    }

    public void moveUpperRight() {
        super.moveUp();
        super.moveRight();
    }

    public void moveUpperLeft() {
        super.moveUp();
        super.moveLeft();
    }
}
