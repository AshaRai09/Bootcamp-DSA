import java.util.*;
public class SpiralTraversalofArray{
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
}