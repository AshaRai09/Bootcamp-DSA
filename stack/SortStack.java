//86. Sort a stack using another stack
import java.util.*;

public class SortStack {

    public static void sortStack(Stack<Integer> st) {

        Stack<Integer> temp = new Stack<>();

        while (!st.isEmpty()) {

            int x = st.pop();

            // move bigger elements back to original stack
            while (!temp.isEmpty() && temp.peek() > x) {
                st.push(temp.pop());
            }

            temp.push(x);
        }

        // copy back sorted stack
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(3);
        st.push(1);
        st.push(4);
        st.push(2);

        sortStack(st);

        System.out.println("Sorted Stack (top to bottom):");

        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}