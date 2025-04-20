// task: 6.3

package CSE111.Assignment_06;

public class Book {
    static int total_books_sold = 0;
    static double total_revenue = 0;
    private double price = 150;
    private double price_after_discount;
    private double discount;
    private String title;

    public Book(String title, int discount) {
        this.title = title;
        this.discount = discount;
        this.price_after_discount = calculatePriceAfterDiscount();
        Book.total_books_sold++;
        Book.total_revenue += price_after_discount;
    }

    private double calculatePriceAfterDiscount() {
        price_after_discount = price - (price * discount / 100);
        return price_after_discount;
    }

    public void bookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Price after discount: " + price_after_discount + "TK"); 
    }


}
