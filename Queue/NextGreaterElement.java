import java.util.*;
public class NextGreaterElement{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Stack<Integer> st = new Stack<>();
    System.out.println("Enter no. of Element :");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    int nge[] = new int[n];
    for(int i=n-1 ;i>=0 ;i--){
      while(!st.isEmpty() && st.peek()<=arr[i]){
        st.pop();
      }
      if(st.isEmpty()){
        nge[i]= -1;
      }
      else{
        nge[i] = st.peek();
      }
      st.push(arr[i]);
    }
       System.out.println("Next Greater Elements:");
      for(int j=0 ; j<n ; j++){
        System.out.print(nge[j]+" ");
      }

  }
}