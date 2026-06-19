//10. DNF (Ducth National Flag Algorithm) Sort (0s, 1s, 2s)
import java.util.*;

public class Sort012Number {
    public static void sortArray(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;

        for (int num : arr) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }

        int index = 0;

        while (count0-- > 0) arr[index++] = 0;
        while (count1-- > 0) arr[index++] = 1;
        while (count2-- > 0) arr[index++] = 2;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0, 1, 0};

        sortArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}