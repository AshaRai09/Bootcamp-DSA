// 2. Difference between first and last element in an array
import java.util.*;
public class DiffBtwFirstAndLast{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0 ;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int difference = arr[n-1]-arr[0];
     System.out.println("Difference = " + difference);
  }
}