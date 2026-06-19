// 6. Sum of array (range given)
import java.util.*;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int r = sc.nextInt();

        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}