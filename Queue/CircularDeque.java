import java.util.*;

class CircularDeque {
    int[] arr;
    int front, rear, size, capacity;

    CircularDeque(int k) {
        capacity = k;
        arr = new int[k];
        front = -1;
        rear = -1;
        size = 0;
    }
  boolean isEmpty(){
    return size==0;
  }
  boolean isfull(){
    return size == capacity;
  }
  boolean insertFront(int x){
    if(isfull()) return false;
    if(isEmpty()){
      front = rear =0;
    }
    else{
      front = (front-1+capacity)%capacity;
    }
    arr[front]=x;
    size++;
    return true;
  }
  boolean insertRear(int x){
    if(isfull()) return false;
    if(isEmpty()){
      front = rear =0;
    }else{
      rear = (rear + 1) % capacity;
        }

        arr[rear] = x;
        size++;
        return true;
    
  }
  boolean deleteFront(){
  if(isEmpty()) return false;
  if(size ==1){
    front = rear =-1;
  }
  else{
    front = (front+1)%capacity;
  }
  size--;
  return true;
  }
  boolean deleteRear(){
    if(isEmpty()) return false;
    if(size ==1){
      front = rear = -1;
    }else{
      rear = (rear-1+capacity)%capacity;
    }
    size--;
    return true;
  }
  int getFront(){
    return isEmpty()?-1:arr[front];
  }
   int getRear() {
        return isEmpty() ? -1 : arr[rear];
    }
     void display() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }
  int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        CircularDeque dq = new CircularDeque(10);
        System.out.println("Insert Elemets:");
        for(int i=0 ; i<5 ;i++){
          dq.insertRear(sc.nextInt());

        }
        dq.display();

        System.out.println("Front: " + dq.getFront());
        System.out.println("Rear: " + dq.getRear());
    }
}