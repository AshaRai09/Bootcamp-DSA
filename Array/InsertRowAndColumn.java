//14. Insert row and column in a matrix
import java.util.*;
public class InsertRowAndColumn{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter position to insert row (0 to " + rows + "): ");
        int rowPos = sc.nextInt();

        int[] newRow = new int[cols];
        System.out.println("Enter elements of new row:");
        for (int i = 0; i < cols; i++) {
            newRow[i] = sc.nextInt();
        }
        int[][] temp = new int[rows + 1][cols];
        for (int i = 0, k = 0; i < rows + 1; i++) {
            if (i == rowPos) {
                temp[i] = newRow;
            } else {
                temp[i] = matrix[k++];
            }
        }
        System.out.print("Enter position to insert column (0 to " + cols + "): ");
        int colPos = sc.nextInt();

        int[] newCol = new int[rows + 1];
        System.out.println("Enter elements of new column:");
        for (int i = 0; i < rows + 1; i++) {
            newCol[i] = sc.nextInt();
        }

        int[][] result = new int[rows + 1][cols + 1];

        for (int i = 0; i < rows + 1; i++) {
            int c = 0;
            for (int j = 0; j < cols + 1; j++) {
                if (j == colPos) {
                    result[i][j] = newCol[i];
                } else {
                    result[i][j] = temp[i][c++];
                }
            }
        }
        System.out.println("Matrix after inserting row and column:");
        for (int i = 0; i < rows + 1; i++) {
            for (int j = 0; j < cols + 1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close(); 
  }
}