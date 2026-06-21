class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }
}

public class UpdatedValueAtIndex {

    static Node update(Node head, int index, int newValue) {

        Node curr = head;
        int i = 0;

        while (curr != null && i < index) {
            curr = curr.next;
            i++;
        }

        if (curr != null) {
            curr.data = newValue;
        }

        return head;
    }

    static void print(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;

        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next;

        head = update(head, 2, 35);

        print(head);
    }
}