import java.util.*;
public class EquilibriumIndex {

    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;

        // Calculate total sum
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {

            // Right sum = Total sum - current element - left sum
            int rightSum = totalSum - arr[i] - leftSum;

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1; // No equilibrium index found
    }

    public static void main(String[] args) {

        int[] arr = {1, 7, 3, 6, 5, 6};

        int index = findEquilibriumIndex(arr);

        if (index == -1)
            System.out.println("No Equilibrium Index");
        else
            System.out.println("Equilibrium Index = " + index);
    }
}