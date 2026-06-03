class Node {
   int data;
   Node next;

   Node(int var1) {
      this.data = var1;
      this.next = null;
   }
}

public class MiddleOfLinkedList {
   Node head;
 void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }
    Node findMiddle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        
            fast = fast.next.next;   
        }

        return slow; // middle node
    }
void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        MiddleOfLinkedList list = new MiddleOfLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.print("Linked List: ");
        list.display(list.head);
        Node middle = list.findMiddle(list.head);

        System.out.println("Middle Element: " + middle.data);
    }
}
