public class Double_Linked_List {
    Node head;
    Node tail;

    public Double_Linked_List() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(TransaksiRental data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(TransaksiRental data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void displayForward() {
        Node current = head;
        while (current != null) {
            current.data.print();
            current = current.next;
        }
    }

    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            current.data.print();
            current = current.prev;
        }
    }

    public void sortByTNKB() {
        if (head == null) return;

        boolean swapped;
        Node current;

        do {
            swapped = false;
            current = head;

            while (current.next != null) {
                if (current.data.br.noTNKB.compareTo(current.next.data.br.noTNKB) > 0) {
                    TransaksiRental temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}