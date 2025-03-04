// Task_03

package CSE111.Assignment_03;

public class Shelf {
    int capacity = 0;
    int noOfBooks = 0;

    public void showDetails() {
        System.out.println("Shelf Capacity: " + this.capacity + "\nNumber of Books: " + this.noOfBooks);
    }
    
    public void addBooks(int noOfBooks) {
        if (capacity == 0) {
            System.out.println("Zero capacity. Cannot add Books");
            return;
        }
        if (this.noOfBooks + noOfBooks <= this.capacity) {
            this.noOfBooks += noOfBooks;
            System.out.println(noOfBooks + " books added to the shelf");
        } else {
            System.out.println("Exceeds cpaacity");
        }
    }
}
