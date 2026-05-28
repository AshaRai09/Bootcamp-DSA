// Sort 0's, 1's and 2's in Java
//This problem is also called the Dutch National Flag Algorithm.
// 
import java.util.*;

public class Sort012DNFA {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
        int arr[] = new int[n];

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid <= high) {

            if(arr[mid] == 0) {

                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }

            else if(arr[mid] == 1) {
                mid++;
            }

            else {

                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}