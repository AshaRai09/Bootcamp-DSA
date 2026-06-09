import java.util.*;
class TwoStack{
  int arr[];
  int size;
  int top1,top2;

  TwoStack(int n){
    size = n;
    arr = new int[n];
    top1 = -1;
    top2 =n;
  }

  boolean push1(int x){
    if(top1<top2-1){
      arr[++top1]=x;
      return true;
    }
    return false;
  }
  boolean push2(int x){
    if(top1<top2-1){
      arr[--top2] = x;
      return true;
    }
    return false;
  }
   int pop1() {
        if (top1 >= 0)
            return arr[top1--];
        return -1; 
    }

    int pop2() {
        if (top2 < size)
            return arr[top2++];
        return -1; 
    }
}
   public class ImplementTwoStackInArray{
   public static void main(String args[]){
    TwoStack ts = new TwoStack(20);

        ts.push1(10);
        ts.push1(20);
        ts.push1(30);

        ts.push2(50);
        ts.push2(60);
        ts.push2(70);

        System.out.println("Pop Stack1: " + ts.pop1());
        System.out.println("Pop Stack2: " + ts.pop2());
   }
}