import java.util.*;
public class ReverseFirstKElement{
   static void reverseK(Queue<Integer>q , int k){
    if(q.isEmpty()|| k>q.size() ||k<=0)
       return ;
    Stack<Integer> st = new Stack();
    for(int i=0;i<k;i++){
      st.push(q.poll());
    }
    while(!st.isEmpty()){
      q.offer(st.pop());
    }
    int n=q.size();
    for(int i=0 ; i<n-k ;i++){
      q.offer(q.poll());
    }
   }
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
     Queue<Integer> q = new LinkedList<>();
     int n= sc.nextInt();
     for(int i=0 ; i<n ; i++){
      q.offer(sc.nextInt());
     }
     reverseK(q,4);
     System.out.println(q);
  }
}