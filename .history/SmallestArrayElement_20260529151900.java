import java.util.*;
public class SmallestArrayElement{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int arr[]= new int[n];
      for(int i=0 ; i<n ; i++){
        arr[i]= sc.nextInt();

      }
      int smallest=0;
      for(int i=0 ; i<n ; i++){
        if(arr[i]>=arr[]){
          smallest = arr[i];
        }
      }
    }
      System.out.println(smallest);

  }
}