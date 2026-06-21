// 85. Generate Binary Number from 1 to N using Queue
import java.util.*;

public class GenerateBinaryNoFrom1toN {

    public static void generate(int n) {

        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 1; i <= n; i++) {

            String curr = q.poll();
            System.out.print(curr + " ");

            q.add(curr + "0");
            q.add(curr + "1");
        }
    }

    public static void main(String[] args) {

        int n = 10;
        generate(n);
    }
}