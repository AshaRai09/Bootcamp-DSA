import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class MyStack{
  Node top;

  // Insertion
  void push(int data){
     Node newNode = new Node(data);
     newNode.next = top;
     top = newNode;
  }
  // deletion
  int pop(){
    if(top==null){
      System.out.println("Stack Underflow");
            return -1;
    }
    int val = top.data;
    top=top.next;
    return val;
  }
  int peek(){
     if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
    return top.data;
  }
   boolean isEmpty() {
        return top == null;
    }
  // Display Stack
  void display(){
    if(top==null){
      System.out.println("Stack is Empty");
            return;
    }
    Node temp = top;
    System.out.print("Stack: ");
    while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
  }
}
  public class StackUsingLinkedList{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      MyStack st = new MyStack();
      System.out.println("Enter no. of Elements you want to Insert");
      int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }
        st.display();
         System.out.println("Top: " + st.peek());

        System.out.println("Popped: " + st.pop());

        st.display();
    }
  }
