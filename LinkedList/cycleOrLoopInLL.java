class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class cycleOrLoopInLL {
  Node head;
  boolean detectCycle(Node head){
    if(head == null) return false;
    Node slow = head;
    Node fast = head;
    while(fast.next==null && fast.next.next==null){
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        
    }
  }

