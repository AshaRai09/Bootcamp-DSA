import java.util.*;

public class Rotate180 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        // Input matrix
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix after 180 degree rotation:");

        for(int i = row - 1; i >= 0; i--) {

            for(int j = col - 1; j >= 0; j--) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}