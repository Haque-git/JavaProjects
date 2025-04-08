// Task: 02

package CSE111.Assignment_04;

public class Toy {
    String name;
    int price;
    public Toy(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("A new toy has been made!");
    }
    public void updateName(String name) {
        System.out.printf("Changing old name: %s\n", this.name);
        this.name = name;
        System.out.printf("new name: %s\n", this.name);
    }
    public void updatePrice(int price) {
        this.price = price;
    }
    public void showPrice() {
        System.out.printf("Price: %s Taka\n",this.price);
    }
}
