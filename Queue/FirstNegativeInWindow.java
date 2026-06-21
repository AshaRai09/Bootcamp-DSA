import java.util.*;

public class FirstNegativeInWindow {

    public static void printFirstNegative(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();

        int i = 0, j = 0;

        while (j < arr.length) {

            // step 1: add negative numbers
            if (arr[j] < 0) {
                q.add(j);
            }

            // step 2: check window size
            if (j - i + 1 < k) {
                j++;
            }

            // step 3: window reached size k
            else if (j - i + 1 == k) {

                // remove out of window elements
                while (!q.isEmpty() && q.peek() < i) {
                    q.poll();
                }

                // print answer
                if (q.isEmpty()) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(arr[q.peek()] + " ");
                }

                // slide window
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;

        printFirstNegative(arr, k);
    }
}