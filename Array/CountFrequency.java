//5. Count frequency of numbers in an array 
import java.util.*;
public class CountFrequency{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int[] freq = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
      int count=1;
      if (freq[i] != 0) continue;
      for(int j=i+1 ; j<n ; j++){
        if(arr[i]== arr[j]){
          count++;
          freq[j] = -1;
        }
      }
       freq[i] = count;
    }
    for (int i = 0; i < n; i++) {
            if (freq[i] != -1) {
                System.out.print(  freq[i]+" ");
            }
        }
  }
}