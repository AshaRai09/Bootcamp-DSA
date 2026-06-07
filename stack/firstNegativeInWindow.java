import java.util.*;
public class firstNegativeInWindow{
    static void firstNegative(int A[], int n, int k) {
    Queue<Integer> queue = new LinkedList<>();
    int index=0;
    while(index<k){
        if(A[index]<0){
          queue.offer(A[index]);
        }
        index++;
    }
    int res[] = new int[n-k+1];
    res[0] = (queue.isEmpty())?0:queue.peek();
    for(int i=1 ;i<n-k+1 ;i++){
      if(A[i-1]<0){
         queue.poll();
      }
      if(A[i+k-1]<0){
        queue.offer(A[i+k-1]);
      }
      res[i] = (queue.isEmpty())?0:queue.peek();
    }
      System.out.println(Arrays.toString(res));
    }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. of Elements:");
    int n= sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter array elements:");
    for(int i=0 ; i<n ;i++){
      arr[i]= sc.nextInt();
    }
     System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        firstNegative(arr, n, k);

        sc.close();
  }
}





















/*
Brute Force

for(int i=0 ; i<n-K+1 ; i++){
   for(int j=i ; j<i+k ;j++){
   if(arr[j]<0){
    ans[i] = arr[j];
    break;
   }
   else{
   ans[i] =0;
   }
   
   }
}
*/