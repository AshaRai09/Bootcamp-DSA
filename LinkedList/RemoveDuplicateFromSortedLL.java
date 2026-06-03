public class RemoveDuplicateFromSortedLL {
  Node head;

    void removeDuplicates() {

        Node temp = head;

        while (temp != null && temp.next != null) {

            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }
}
