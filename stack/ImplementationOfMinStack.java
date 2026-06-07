import java.util.*;
class MinStack{
  Stack<Integer> stack = new Stack<>();
  Stack<Integer> minStack = new Stack<>();

  void push(int x){
    stack.push(x);
    if(minStack.isEmpty() || x<=minStack.peek()){
      minStack.push(x);
    }
  }
  void pop(){
    if(stack.isEmpty()){
      return ;
    }
    int removed = stack.pop();
    if(removed == minStack.peek()){
      minStack.pop();
    }
  }
  int top(){
    return stack.peek();
  }
  int getMin(){
    return minStack.peek();
  }
  
}
public class ImplementationOfMinStack{
 public static void main(String[] args) {
        MinStack ms = new MinStack();

        ms.push(5);
        ms.push(2);
        ms.push(8);
        ms.push(1);

        System.out.print(ms.getMin()+" "); // 1

        ms.pop();
        System.out.println(ms.getMin()+ " "); // 2
    }
}