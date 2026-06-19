// Find max sum of row in a matrix and discard it while printing
import java.util.*;
public class MaxSumRowAndSkip{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int arr[][] = new int[n][m];
    for(int i=0 ;i<n;i++){
      for(int j=0;j<m;j++){
         arr[i][j] = sc.nextInt();
      }
    }
    int maxSum = Integer.MIN_VALUE;
    int maxRowIndex = -1;
    for(int i=0; i<n ;i++){
      int sum=0;
      for(int j=0 ;j<m;j++){
        sum+= arr[i][j];
      }
      if(sum>maxSum){
        maxSum = sum;
        maxRowIndex = i;
      }
    }
     System.out.println("Matrix after removing row with maximum sum:");

        for (int i = 0; i < arr.length; i++) {
            if (i == maxRowIndex)
                continue;

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
  }
}