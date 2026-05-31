import java.util.Scanner;

public class MatrixInsert {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter 0 to delete row, 1 to delete column:");
        int choice = sc.nextInt();

        if (choice == 0) {

            System.out.print("Enter row index to delete: ");
            int row = sc.nextInt();

            for (int i = 0; i < r; i++) {
                if (i == row)
                    continue;

                for (int j = 0; j < c; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

        } else if (choice == 1) {

            System.out.print("Enter column index to delete: ");
            int col = sc.nextInt();

            for (int i = 0; i < r; i++) {

                for (int j = 0; j < c; j++) {
                    if (j == col)
                        continue;

                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}