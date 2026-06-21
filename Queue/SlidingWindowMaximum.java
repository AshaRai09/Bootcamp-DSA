import java.util.*;

public class SlidingWindowMaximum {

    static int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            // Remove indices outside current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();

            // Remove smaller elements
            while (!dq.isEmpty() &&
                    nums[dq.peekLast()] < nums[i])
                dq.pollLast();

            dq.offerLast(i);

            // Window formed
            if (i >= k - 1)
                ans[i - k + 1] = nums[dq.peekFirst()];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int[] ans = maxSlidingWindow(nums, k);

        for(int x : ans)
            System.out.print(x + " ");
    }
}