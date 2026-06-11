import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int start = 0;
         int sum = 0;
        boolean found = false;
        for (int end = 0; end < n; end++) {
            sum += arr[end];

            while (sum > target && start <= end) {
                 sum -= arr[start];
                 start++;
                }
               if (sum == target) {
                System.out.println("First Index: " + start);
                System.out.println("Last Index: " + end);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No subarray found");
        }

        sc.close();
    }
}