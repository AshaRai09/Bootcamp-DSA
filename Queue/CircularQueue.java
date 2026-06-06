// 
import java.util.*;
public class CircularQueue {
  int arr[];
  int capacity , front , rear , size;
  CircularQueue(int n){
    capacity = n;
    arr = new int[n];
    front=0;
    rear =-1;
    size =0;
  }
  boolean isEmpty(){
    return size==0;
  }
  boolean isfull(){
    return size==capacity;
  }
   void enqueue(int x){
      if(isfull()){
        System.out.println("Queue full");
        return;
      }
      rear = (rear+1)%capacity;
      arr[rear]=x;
      size++;
  }
  int dequeue(){
    if(isEmpty()){
      System.out.println("Queue Empty");
      return -1;
    }
    front = (front+1)%capacity;
    size--;
    return val;
  }
  int getFront(){
        return isEmpty() ? -1 : arr[front];
    }

    int getRear(){
        return isEmpty() ? -1 : arr[rear];
    }
  public static void main(String args[]){
  CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());

        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Front = " + q.getFront());
        System.out.println("Rear = " + q.getRear());
  }
}
