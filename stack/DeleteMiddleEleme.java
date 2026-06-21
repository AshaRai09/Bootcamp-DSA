// 87. Delete middle element of stack
import java.util.*;

public class DeleteMiddleEleme {

    public static void deleteMiddle(Stack<Integer> st, int n, int current) {

        // base case: middle reached
        if (st.isEmpty() || current == n) return;

        int x = st.pop();

        // if middle element
        if (current != n / 2) {
            deleteMiddle(st, n, current + 1);
            st.push(x);
        }
        // else: skip (delete it)
        else {
            deleteMiddle(st, n, current + 1);
        }
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        int n = st.size();

        deleteMiddle(st, n, 0);

        System.out.println("Stack after deleting middle:");

        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}