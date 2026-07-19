import java.util.*;
public class PriorityQueueDemo {
  public static void main(String args[]){
    // min heap in sorted order
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
      pq.add(sc.nextInt());
    }
        // Display
        System.out.println(pq);

        // Also Display
        System.out.println("Priority Queue:");
        for (int x : pq) {
            System.out.print(x + " ");
        }

        //front element
        System.out.println("\n"+pq.peek());

        // remove
        System.out.println(pq.poll());
        System.out.println(pq.peek());

        // Insert
        System.out.println(pq.offer(20));

        // Size
        System.out.println("Size: " + pq.size());

        // Empty?
        System.out.println("Is Empty: " + pq.isEmpty());

        // Contains
        System.out.println("Contains 20: " + pq.contains(20));

        // Clear
        pq.clear();

        System.out.println(pq);
    sc.close();
  }
}
// by deafault implement in min heap
/*

1. add() vs offer()
Both insert an element.
add() throws an exception if insertion fails.
offer() returns false if insertion fails.

2. remove() vs poll()
Both remove the front element.
remove() throws NoSuchElementException if the queue is empty.
poll() returns null if the queue is empty.

3. element() vs peek()
Both return the front element without removing it.
element() throws NoSuchElementException if the queue is empty.
peek() returns null if the queue is empty.
*/

/*
// Max heap in heap order
  PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        System.out.println("Max Heap: " + pq);
        System.out.println("Top element: " + pq.peek());

        // To print elements in descending order
        while (!pq.isEmpty()) {
        System.out.print(pq.poll() + " ");
}

*/