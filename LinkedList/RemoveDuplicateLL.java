// Remove Duplicate from  Unsorted Linkedlist
import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class RemoveDuplicateLL {

    static Node removeDuplicates(Node head) {

        if (head == null)
            return null;

        HashSet<Integer> set = new HashSet<>();

        Node curr = head;
        Node prev = null;

        while (curr != null) {

            if (set.contains(curr.data)) {
                prev.next = curr.next;   // delete duplicate
            } else {
                set.add(curr.data);
                prev = curr;             // move prev
            }

            curr = curr.next;
        }

        return head;
    }
}