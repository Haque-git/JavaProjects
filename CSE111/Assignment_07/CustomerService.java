package CSE111.Assignment_07;

public class CustomerService {
    private Queue head;
    private Queue tale;
    private int maxSize;
    private int size;

    public CustomerService(int maxSize) {
        this.maxSize = maxSize;
        this.head = null;
        this.tale = null;
        this.size = 0;
    }

    public void addCustomer(String customerName) {
        if (size >= maxSize) {
            System.out.printf("Queue is full. Cannot add %s\n", customerName);
            return;
        }
        Queue newCustomer = new Queue(customerName);
        if (this.head == null) {
            this.head = this.tale = newCustomer;
        } else {
            this.tale.next = newCustomer;
            newCustomer.prev = this.tale;
            this.tale = newCustomer;
        }
        size++;
        System.out.println("Added: " + customerName);
    }

    public void serveCustomer() {
        if (head == null) {
            System.out.println("No customer to serve.");
            return;
        }
        System.out.println("Serving " + head.getCustomerName());
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tale = null;
        }
        size--;
    }
}
