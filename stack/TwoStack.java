import java.util.*;
public class TwoStack{
  int arr[];
  int cap,top1,top2;
  TwoStack(int n){
    cap=n;
    top1=-1;
    top2 = n;
    arr = new int[n];
  }
    boolean push1(int x){
      if(top1<top2-1){
        top1++;
        arr[top1]=x;
        return true;
      }
      return false;
    }
    boolean push2(int x){
      if(top1<top2-1){
        top2--;
        arr[top2]=x;
        return true;
      }
      return false;
    }
    int pop1(){
      if(top1 == -1){
        System.out.println("Underflow");
            return -1;
      }
      return arr[top1--];
    }
    int pop2(){
      if (top2 == arr.length) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[top2++];
    }
    void display() {
        System.out.print("Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
      TwoStack st = new TwoStack(20);
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of Elemets in First stack: ");
      int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            st.push1(sc.nextInt());
        }
      System.out.println("Enter number of Elemets in Second stack: ");
      int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            st.push2(sc.nextInt());
        }
        st.display();
        System.out.println("Pop Stack1: " + st.pop1());
        System.out.println("Pop Stack2: " + st.pop2());
    }
  }
