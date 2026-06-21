//59. Remove node whose sum of data is Even.
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

 public class RemoveNodeWhoseSumEeven{

    static Node removeEvenNodes(Node head) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node curr = dummy;

        while (curr.next != null) {

            if (curr.next.data % 2 == 0) {
                curr.next = curr.next.next; // delete even node
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}