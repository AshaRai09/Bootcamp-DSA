// 60. Cloning of linkedlist
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class ClonningLL {

    static Node cloneList(Node head) {

        if (head == null)
            return null;

        Node newHead = new Node(head.data);

        Node curr = head.next;
        Node tail = newHead;

        while (curr != null) {

            tail.next = new Node(curr.data);

            tail = tail.next;
            curr = curr.next;
        }

        return newHead;
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
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Node clone = cloneList(head);

        System.out.print("Original: ");
        print(head);

        System.out.print("Clone: ");
        print(clone);
    }
}