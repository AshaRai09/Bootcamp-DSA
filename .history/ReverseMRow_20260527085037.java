import java.util.*;
public class ReverseMRow{
  void reverseRow(int arr[][]){
    for(int i=0 ;i<arr.length;i++){
      int s=0;
      int e=arr[i].length-1;
      while(s<e){
        int temp = arr[i][s];
        arr[i][0]=arr[i][e];
        arr[i][e]=temp;
        s++;
        e--;
      }
    }
  }
  public static void printarr(int arr[][]){
    for(int row[]:arr){
      System.out.println(Arrays.toString(row));
    }
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m  = sc.nextInt();
      int arr[][] = new int[n][m];
      for(int i=0 ; i<n;i++){
        for(int j=0 ; j<m ; j++){
           arr[i][j]=sc.nextInt();
        }
      }
      ReverseMRow(arr);
      printarr(arr);
  }
}