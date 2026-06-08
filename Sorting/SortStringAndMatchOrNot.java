import java.util.*;

public class SortStringAndMatchOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter no. of String: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.print("Enter target string: ");
        String target = sc.nextLine();

        Arrays.sort(arr);

        System.out.println("Sorted Strings:");
        System.out.println(Arrays.toString(arr)+" ");
        int index = Arrays.binarySearch(arr, target);

        if (index >= 0)
            System.out.println("Target found at index " + index);
        else
            System.out.println("Target not found");

        sc.close();
    }
}