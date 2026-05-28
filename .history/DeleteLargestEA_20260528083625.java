import java.util.*;
public class DeleteLargestEA{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    for(int i=0 ; i<n ;i++){
      arr[i]= sc.nextInt();
    }
    int max = arr[0];
    int index =0;
    for(int i=0 ;i<n ;i++){
      if(arr[i]>max){
        max = arr[i];
        index =i;
      }
    }
    for(int i=index ;i<n-1 ;i++){
      arr[i] = arr[i+1];
    }
    System.out.println("Updated Array: ")
  }
}