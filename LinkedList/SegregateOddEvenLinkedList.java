/* 57. Segragate Odd Even Linkedlist
Given a linked list, rearrange it such that all odd-valued nodes come first, followed by all even-valued nodes, preserving their original relative order.
*/
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class SegregateOddEvenLinkedList{

    static Node segregateOddEven(Node head) {

        if (head == null)
            return null;

        Node oddHead = null, oddTail = null;
        Node evenHead = null, evenTail = null;

        Node curr = head;

        while (curr != null) {

            if (curr.data % 2 != 0) {     // Odd node

                if (oddHead == null) {
                    oddHead = oddTail = curr;
                } else {
                    oddTail.next = curr;
                    oddTail = curr;
                }

            } else {                     // Even node

                if (evenHead == null) {
                    evenHead = evenTail = curr;
                } else {
                    evenTail.next = curr;
                    evenTail = curr;
                }
            }

            curr = curr.next;
        }

        // No odd nodes
        if (oddHead == null) {
            evenTail.next = null;
            return evenHead;
        }

        // No even nodes
        if (evenHead == null) {
            oddTail.next = null;
            return oddHead;
        }

        // Connect odd list to even list
        oddTail.next = evenHead;
        evenTail.next = null;

        return oddHead;
    }
}