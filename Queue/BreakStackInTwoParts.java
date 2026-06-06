import java.util.*;
public class BreakStackInTwoParts{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  Stack<Integer> st = new Stack<>();
  ArrayDeque<Integer> queue = new ArrayDeque<>();
   System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter stack elements:");

        for(int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }
        while(!st.isEmpty()) {
            queue.offer(st.pop());
        }
        Stack<Integer> temp = new Stack<>();
        while(!queue.isEmpty()) {
            temp.push(queue.poll());
        }

        while(!temp.isEmpty()) {
            queue.offer(temp.pop());
        }
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        int firstHalf = n / 2;

        // First half
        for(int i = 0; i < firstHalf; i++) {
            s1.push(queue.poll());
        }

        // Second half
        while(!queue.isEmpty()) {
            s2.push(queue.poll());
        }

        System.out.println("Stack 1: " + s1);
        System.out.println("Stack 2: " + s2);    
      
}
}