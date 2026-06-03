class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
    
  }
}
public class CountOcurrances {
   Node head;

    int countOccurrence(int key) {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                count++;
            }
            temp = temp.next;
        }

        return count;
    }
}
