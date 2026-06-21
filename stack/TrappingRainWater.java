import java.util.*;

public class TrappingRainwater{

    public static int trap(int[] height) {

        Stack<Integer> st = new Stack<>();
        int water = 0;

        for (int i = 0; i < height.length; i++) {

            while (!st.isEmpty() && height[i] > height[st.peek()]) {

                int bottom = st.pop();

                if (st.isEmpty()) break;

                int left = st.peek();
                int right = i;

                int width = right - left - 1;
                int boundedHeight = Math.min(height[left], height[right]) - height[bottom];

                water += width * boundedHeight;
            }

            st.push(i);
        }

        return water;
    }

    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3};

        System.out.println(trap(height));
    }
}