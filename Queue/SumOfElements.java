import java.util.*;

public class SumOfElements {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        int sum = 0;

        while (!q.isEmpty()) {
            sum += q.poll();   // Remove front element and add to sum
        }

        System.out.println("Sum = " + sum);
    }
}