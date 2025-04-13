package Data_stucture.Linked_list;

public class LinkedList {
    Node head;
    Node tale;
    int size;

    public LinkedList() {
        this.head = null;
        this.tale = null;
        this.size = 0;
    }

    public void add(Node newNode) {
        if (this.head == null) {
            this.head = newNode;
            this.tale = newNode;

        } else {
            this.tale.next = newNode;
            this.tale = newNode;
        }
        this.size++;
    }

    void disply() {
        Node currentNode = this.head;
        while (currentNode != null) {
            currentNode.printDetail();
            currentNode = currentNode.next;
        }
    }


    void replace(Node newNode, int position) {
        if(position >= size){
            return;
        }
        if (position == 0) {
            newNode.next = this.head.next;
            this.head = newNode;
        } else if(position == size - 1) {
            Node prevNode = getPrevNode(position);
            prevNode.next = newNode;
            this.tale = newNode; 
        } else {
            Node prevNode = getPrevNode(position);
            newNode.next = prevNode.next.next;
            prevNode.next = newNode;
        }
    }

    private Node getPrevNode(int pos) {
        if (pos < 1) throw new IllegalArgumentException("Position must be >= 1");
    
        Node prevNode = this.head;
        int currPos = 1;
    
        while (currPos < pos) {
            if (prevNode == null) throw new IndexOutOfBoundsException("Position out of bounds");
            prevNode = prevNode.next;
            currPos++;
        }
        return prevNode;
    }    


}
