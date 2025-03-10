// Task 07

package CSE111.Assignment_03;

public class Cart {
    private int cartID;
    private String [] items;
    private double [] prices;
    private int count;
    private double discount;
    private double total;
    private int capacity = 3;

    public void create_cart(int n) {
        cartID = n;
        items = new String[capacity];
        prices = new double[capacity];
        count = 0;
        discount = 0;
    }

    public void addItem(String item, double price) {
        if(count < items.length) {
            items[count] = item;
            prices[count] = price;
            total += price;
            count++;
            System.out.println(item + " added to cart " + cartID);
            System.out.printf("You have %d item(s) in your cart now\n", count);
            
        } else {
            System.out.println("You already have 3 items on your cart");
        }
    }
    
    public void addItem(double price, String item) {
        this.addItem(item, price);
    }

    public void cartDetails() {
        System.out.printf("Your Cart: (Cart %d)\n",cartID);
        for(int i = 0; i < count; i++) {
            System.out.println(items[i] + " - " + prices[i]);
            total += prices[i];
        }
        System.out.println("Discount Applied: " + discount);
        System.out.println("Total price: " + (total - discount));
    }

    public void giveDiscount(double percentage) {
        discount = total * percentage / 100;
    }
    

}
