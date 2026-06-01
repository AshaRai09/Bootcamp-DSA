import java.util.*;
public class FindnextPermutation {

    public static String nextPermutation(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length;

        // Find pivot
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i == -1) {
            return "No Next Permutation";
        }

        // Find next greater character
        int j = n - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Swap
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // Reverse suffix
        int left = i + 1;
        int right = n - 1;

        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
      Sanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(nextPermutation(str));
    }
}