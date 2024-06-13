/**
 * Node
 */
public class Node {

    TransaksiRental data;
    Node next;
    Node prev;

    public Node(TransaksiRental data) {
        this.data = data;  
        this.next = null;
        this.prev = null;
    }
}