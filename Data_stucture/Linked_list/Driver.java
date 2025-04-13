package Data_stucture.Linked_list;

public class Driver {

    public static void main(String[] args) {
        Node n1 = new Node("Tonoy", 123);
        Node n2 = new Node("Adnan", 234);
        Node n3 = new Node("Rhydhica", 456);
        Node n4 = new Node("Nigga", 567);

        LinkedList myList = new LinkedList();
        myList.add(n1);
        myList.add(n2);
        myList.add(n3);
        myList.replace(n4, 1);
        
        myList.disply();

    }
}
