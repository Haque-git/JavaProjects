package CSE111.Assignment_07;

public class Queue {
    private String customerName;

    Queue next;
    Queue prev;
    public Queue(String customerName) {
        this.customerName = customerName;
        this.next = null;
        this.prev = null;
    }
    public String getCustomerName() {
        return this.customerName;
    }
}
