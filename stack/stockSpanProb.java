import java.util.*;
  public class stockSpanProb{
    static int[] calculatespan(int[] price){
      int n= price.length;
      int span[]= new int[n];
      // store indices
      Stack<Integer> st = new Stack<>();
      
      for(int i=0 ;i<n;i++){
        while(!st.isEmpty() && price[st.peek()]<= price[i]){
          st.pop();
        }
        if(st.isEmpty()){
          span[i] = i+1;
        }
        else{
          span[i] = i-st.peek();
        }
       st.push(i);
      }
      return span;
    }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         int[] span = calculatespan(arr);

        System.out.println(Arrays.toString(span));

        sc.close();
  }
}

/*
Brute force code

public static ArrayList<Integer> CalcSpan(int arr[]){
int n= arr.length;
ArrayList<Integer>span = new ArrayList<>();
for(int i=0 ; i<n ;i++){
int count=1;
for(int j=i-1;j>=0 ; j--){
if(arr[j] <=arr[i]){
count++;
} else{
break;
}
}
span.add(count);
}
return span;
*/