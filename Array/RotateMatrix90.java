//18. Rotate matrix by 90°
import java.util.*;
public class RotateMatrix90 {
    public static void rotate90(int[][] mat) {
        int n = mat.length;

      
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

       
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;

            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate90(mat);

        for (int[] row : mat) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}