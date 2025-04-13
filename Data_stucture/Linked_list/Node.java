package Data_stucture.Linked_list;

public class Node {
    //data
    String name;
    int phone;

    //address
    Node next;

    public Node(String name, int phone) {
        this.name = name;
        this.phone = phone;
        this.next = null;
    }

    void printDetail() {
        System.out.println(name + " " + phone);
    }

}
