import java.util.*;
public class ImpQueueUsingStack{
 Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        s1.push(x);
    }
    int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if(s2.isEmpty()){
          while(!s1.isEmpty()){
            s2.push(s1.pop());
          }
        }
        return s2.pop();
    }
      int front() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if (s2.isEmpty()) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
          }
        }

         return s2.peek();
   }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    ImpQueueUsingStack q = new  ImpQueueUsingStack();
    System.out.println("Enter no. of elements:");
    int n= sc.nextInt();
    for(int i=0 ; i<n ;i++){
      q.enqueue(sc.nextInt());
    }
      System.out.println("Front: " + q.front());

        System.out.println("Dequeued: " + q.dequeue());

        System.out.println("Front after dequeue: " + q.front());

        q.enqueue(40);

        System.out.println("Dequeued: " + q.dequeue());

        System.out.println("Front: " + q.front());

   }
}