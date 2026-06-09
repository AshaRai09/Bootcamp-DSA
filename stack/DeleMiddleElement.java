import java.util.*;
public class DeleMiddleElement{
  static void deleteMiddle(Stack<Integer>stack , int k){
    if(k==1){
      stack.pop();
      return ;
    }
    int temp = stack.pop();
    deleteMiddle(stack , k-1);
    stack.push(temp);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    int n= sc.nextInt();
    for(int i=0 ; i<n;i++){
      stack.push(sc.nextInt());
    }
    int k= n/2+1;
    deleteMiddle(stack , k);
    System.out.println(stack);
  }
}