import java.util.*;
public class PriorityQueueDemo {
  public static void main(String args[]){
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
      pq.add(sc.nextInt());
    }
    System.out.println(pq.peek());
    System.out.println(pq.poll());
    System.out.println(pq.peek());
    
    sc.close();
  }
}
