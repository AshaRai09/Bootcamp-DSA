import java.util.*;

public class TicketFoundOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of tickets: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Ticket:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Sorted Arrangement of Tickets: " + Arrays.toString(arr));

        System.out.print("Enter Tickets to search: ");
        int key = sc.nextInt();

        int index = Arrays.binarySearch(arr, key);

        if (index >= 0) {
            System.out.println("Ticket found at position " + index);
        } else {
            System.out.println("Ticket not found");
        }

        sc.close();
    }
}