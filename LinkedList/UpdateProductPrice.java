import java.util.*;
class Node{
  int  data;
  node prev;
  node next;

     node(int value){
      data = value;
      prev = null;
      next = null; 
    }
}
public class UpdateProductPrice{
  static Node head = null;
  static void insert(val){
    Node newNode = new Node(val);
    if(head==null){
      head = newNode;
      return;
    }
    Node temp = head;
    while(temp.next!=null){
    temp = temp.next;
    temp.next = newNode;
    }}
    static  int countNode(){
      int count =;
      Node temp = head;
    }
  
}