import java.util.*;
public class celebrity{
   
       // This function is assumed given in problem
    static boolean knows(int a, int b, int[][] M) {
        return M[a][b] == 1;
    }

    public static int findCelebrity(int[][] M, int n) {

        Stack<Integer> st = new Stack<>();

        // Step 1: push all people
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        // Step 2: eliminate
        while (st.size() > 1) {
            int A = st.pop();
            int B = st.pop();

            if (knows(A, B, M)) {
                st.push(B); // A is not celebrity
            } else {
                st.push(A); // B is not celebrity
            }
        }

        int candidate = st.pop();

        // Step 3: verify candidate
        for (int i = 0; i < n; i++) {

            if (i != candidate) {
                if (knows(candidate, i, M) || !knows(i, candidate, M)) {
                    return -1;
                }
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[][] M = {
            {0, 1, 1},
            {0, 0, 1},
            {0, 0, 0}
        };

        System.out.println(findCelebrity(M, 3)); 
       
    }
}