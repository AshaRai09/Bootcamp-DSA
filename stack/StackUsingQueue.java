import java.util.*;
public class StackUsingQueue{
Queue<Integer> q1 = new LinkedList<>();
Queue<Integer> q2 = new LinkedList<>();

void push(int x){
  q2.offer(x);
  while(!q1.isEmpty()){
    q2.offer(q1.poll());
  }
  Queue<Integer> temp = q1;
  q1 = q2;
  q2 = temp;
}
int pop(){
  if(q1.isEmpty()){
    System.out.println("Stack is Empty");
    return -1;
  }
  return q1.poll();
}
int top(){
  if(q1.isEmpty()){
    System.out.println("Stack is Empty");
    return -1;
  }
  return q1.peek();
}

public static void main (String args[]){
  Scanner sc= new Scanner(System.in);

  StackUsingQueue st = new StackUsingQueue();
  System.out.println("Enter no. of Elements:");
    int n= sc.nextInt();
    for(int i=0 ; i<n ;i++){
      st.push(sc.nextInt());
    }
     System.out.println("Top: " + st.top());

      System.out.println("Popped: " + st.pop());
}
}