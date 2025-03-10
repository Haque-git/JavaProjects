// Task_05

package CSE111.Assignment_03;

public class Library {
    private int book_capacity;
    private String[] book_list;
    private int current_book_count;
    
    public void setBook_capacity(int book_capacity){
        this.book_capacity = book_capacity;
        book_list = new String[book_capacity];
        current_book_count = 0;
    }

    public void addBook(String book_name){
        if(current_book_count < book_capacity){
            book_list[current_book_count] = book_name;
            current_book_count++;
            System.out.printf("Book '%s' added to the library", book_name);
            System.out.println();
        } else {
            System.out.println("Exceeds maximum capacity. You can't add more than "+ book_capacity +" books");
        }
    }

    public void printDetail(){
        System.out.println("Maximum capacity: "+ book_capacity);
        System.out.println("Total Books: "+ current_book_count);
        System.out.println("Book List: ");
        for(int i = 0; i < current_book_count; i++){
            System.out.println(book_list[i]);
        }
    }

}
