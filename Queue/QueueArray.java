import java.util.*;

public class QueueArray {
    int arr[];
    int front, rear, capacity;

    QueueArray(int size) {
        capacity = size;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }

    boolean isEmpty() {
        return rear < front;
    }

    boolean isFull() {
        return rear == capacity - 1;
    }

    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        arr[++rear] = x;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front++];
    }

    int peek() {
        if (isEmpty()) return -1;
        return arr[front];
    }
    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.peek());    // 20
    }
}