import java.util.*;

public class MatrixDiagonalElement {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        // Input matrix
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        for(int i = 0; i < n; i++) {

            primarySum += arr[i][i];

            secondarySum += arr[i][n - 1 - i];
        }

        int difference = Math.abs(primarySum - secondarySum);

        System.out.println("Diagonal Difference = " + difference);
    }
}