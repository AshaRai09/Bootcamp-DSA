import java.util.*;
public class VoteCount{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       int arr[]= new int[n];
       for(int i=0; i<n ; i++){
        arr[i]= sc.nextInt();
       }
       Arrays.sort(arr);
       int count=0;
       int Threshold=2;
       for(int i=0 ;i<n-1 ; i++){
        if(arr[i]== arr[i+1]){
          count++;
          if(count>Threshold){
            System.out.println(arr[i]);
              return;
          }
        }
          else {
            count=1;
          }
        
       }
       System.out.println("No c")
  }
}