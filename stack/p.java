
import java.util.*;

public class p {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        System.out.println("Stack: " + stack);
        int removed = stack.pop();
        System.out.println("Popped: " + removed);
        sc.close();
    }
}
