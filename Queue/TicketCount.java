
import java.util.*;

class QNode {

    int data;
    QNode next;

    QNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {

    QNode front, rear;

    Queue() {
        front = rear = null;
    }

    void enqueue(int val) {
        QNode newNode = new QNode(val);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    int sum() {
        int sum = 0;
        QNode temp = front;
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        return sum;
    }
}

public class TicketCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            q.enqueue(sc.nextInt());
        }

        System.out.println("Sum = " + q.sum());
        sc.close();
    }

}
