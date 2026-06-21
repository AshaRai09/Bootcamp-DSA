//76. Stock Span
import java.util.Stack;

public class StockSpan {

    static void stockSpan(int[] price) {

        int n = price.length;
        int[] span = new int[n];

        Stack<Integer> st = new Stack<>();

        span[0] = 1;
        st.push(0);

        for (int i = 1; i < n; i++) {

            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }

            if (st.isEmpty())
                span[i] = i + 1;
            else
                span[i] = i - st.peek();

            st.push(i);
        }

        // Print spans
        for (int x : span)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {

        int[] price = {100, 80, 60, 70, 60, 75, 85};

        stockSpan(price);
    }
}