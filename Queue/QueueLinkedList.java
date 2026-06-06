class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class QueueLinkedlist {
    Node front, rear;

    QueueLL() {
        front = rear = null;
    }

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(int x) {
        Node newNode = new Node(x);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        int val = front.data;
        front = front.next;

        if (front == null)
            rear = null;

        return val;
    }

    int peek() {
        if (isEmpty())
            return -1;

        return front.data;
    }
}