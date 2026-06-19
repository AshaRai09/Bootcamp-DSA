// 8. Longest consecutive increasing subarray .
import java.util.*;
public class LongestConsecutiveIncArray{
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[] = new int[n];
    for(int i=0 ;i<n;i++){
      arr[i] = sc.nextInt();
    }
    if(n==0) { System.out.println("0"); }
    Arrays.sort(arr);
    int maxLen =1;
    int prev = arr[0];
    int len =1;
     for(int i=0;i<n;i++){
        if(prev == arr[i]){
            continue;
        }
        if(arr[i]==(prev+1)){
          len++;
        } else{
          len=1;
        }
        prev = arr[i];
        maxLen = Math.max(maxLen , len);
     }
     System.out.println(maxLen);
   }
}