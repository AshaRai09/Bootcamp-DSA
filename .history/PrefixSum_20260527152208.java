// program to build prefix sum array, and then answers a range sum query
import java.util.*;
public class PrefixSum{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[]= new int[n];
      for(int i=0 ;i<n ; i++){
        arr[i]= sc.nextInt();
      }
      int prefix[50];
      prefix[0]=0;
      for(int i=0 ;i<=n ;i++){
        prefix[i]= prefix[i-1]+arr[i-1];
      }
      int l= sc.nextInt();
      int r=sc.nextInt();
      int sum = 

  }
}