// Take an array as input, find a target sum subarray, and print the first and last index of the subarray whose sum equals the target.
import java.util.*;
public class targetSum{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[] = new int[n];
    for(int i=0 ;i<n;i++){
      arr[i]=sc.nextInt();
    }
    boolean found = false;
    int target = sc.nextInt();
    for(int i=0;i<n ;i++){
      int sum=0;
      for(int j=i ;j<n;j++){
        sum+=arr[j];
        if(target == sum){
          System.out.println(i +" "+ j);
          found = true;
          break;
        }
      }
      if(found) break;
    }
    if(!found){
      System.out.println("-1");
    }
    sc.close();
  }
}