package CSE111.Assignment_06;

public class Product {
    private String name;
    private double price;
    private int quantity = 0;

    public Product() {
        name = "Unknown";
        price = 0.00;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity; 
    }

    public void displayInfo() {
        System.out.printf("Product Name: %s\nPrice: $%.1f\n", name, price);
    }

    public void displayInfo(boolean shouldShowQuantity) {
        this.displayInfo();
        if (shouldShowQuantity) {
            System.out.printf("Quantity: %d\n", quantity);
        }
    }
}
