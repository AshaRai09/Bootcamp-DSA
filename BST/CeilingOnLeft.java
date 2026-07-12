import java.util.*;

public class CeilingOnLeft {

    public static void ceilingOnLeft(int[] arr) {

        TreeSet<Integer> set = new TreeSet<>();

        for (int x : arr) {

            Integer ceil = set.ceiling(x);

            if (ceil == null)
                System.out.print("-1 ");
            else
                System.out.print(ceil + " ");

            set.add(x);
        }
    }

    public static void main(String[] args) {

        int arr[] = {2, 8, 30, 15, 25, 12};

        ceilingOnLeft(arr);
    }
}