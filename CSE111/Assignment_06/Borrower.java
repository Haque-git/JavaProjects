// task: 6.5

package CSE111.Assignment_06;

public class Borrower {
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};

    private String name;
    private String[] borrowedBooks = new String[3];
    private int borrowedCount = 0;

    public Borrower(String name) {
        this.name = name;
    }

    public static void bookStatus() {
        System.out.println("Available Books: ");
        for (int i = 0; i < book_name.length; i++) {
            System.out.println(book_name[i] + ": " + book_count[i]);
        }
    }

    public static int remainingBooks(String bookName) {
        for (int i = 0; i < book_name.length; i++) {
            if (book_name[i].equalsIgnoreCase(bookName)) {
                return book_count[i];
            }
        }
        return 0;
    }

    public void borrowBook(String bookName) {
        if (remainingBooks(bookName) < 1) {
            System.out.println("This book is not available.");
            return;
        }
        borrowedBooks[borrowedCount] = bookName;
        borrowedCount++;
        this.updateBookCount(bookName);
    }

    public void borrowerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Books Borrowed: ");
        for (int i = 0; i < borrowedCount; i++) {
            System.out.println(borrowedBooks[i]);
        }
    }


    private void updateBookCount(String bookName) {
        for (int i = 0; i < book_name.length; i++) {
            if (book_name[i].equalsIgnoreCase(bookName)) {
                book_count[i]--;
                break;
            }
        }
    }

}
