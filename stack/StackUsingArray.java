import java.util.*;
class MyStack {
    int[] arr;
    int top;

    MyStack(int size) {
        arr = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        MyStack st = new MyStack(5);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }

        st.display();

        System.out.println("Top element: " + st.peek());

        System.out.println("Popped: " + st.pop());

        st.display();
    }
}

