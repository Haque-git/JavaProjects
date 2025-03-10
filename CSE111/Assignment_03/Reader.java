// Task 08

package CSE111.Assignment_03;

public class Reader {
    private String name = "New user";
    private String [] books;
    private int count;
    private int capacity = 0;

    public String createReader(String name, int capacity) {
        this.name = name;
        books = new String[capacity];
        count = 0;
        this.capacity = capacity;
        return "A new reader is created!";
    }


    public void readerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Books: ");
        if (capacity == 0) {
            System.out.println("No books added yet");
            
        } else {
            for(int i = 0; i < count; i++) {
                System.out.printf("Book %d: %s\n", i, books[i]);
            }
        }
    }

    public void addBook(String book) {
        if (count >= capacity) {
            System.out.println("No more capacity");
            return;
        }
        books[count] = book;
        count++;
    }
    
}
