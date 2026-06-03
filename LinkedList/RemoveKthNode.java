class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
    
  }
}
public class RemoveKthNode {
  
    Node head;

    void deleteKthNode(int k) {

        // Case 1: empty list
        if (head == null) return;

        // Case 2: delete first node
        if (k == 1) {
            head = head.next;
            return;
        }

        Node temp = head;

        // move to (k-1)th node
        for (int i = 1; i < k - 1; i++) {
            if (temp == null || temp.next == null) return;
            temp = temp.next;
        }

        // if kth node doesn't exist
        if (temp == null || temp.next == null) return;

        // delete kth node
        temp.next = temp.next.next;
    }
}
