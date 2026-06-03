import java.util.ArrayList;
class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
    
  }
}
public class PalindromeLL {
  Node head;
    public boolean isPalindrome(Node head) {
      ArrayList<Integer>arr = new ArrayList<>();
      Node temp = head;
      while(temp!=null){
        arr.add(temp.data);
        temp = temp.next;
      }
      int left =0;
      int right = arr.size()-1;
      while(left<right){
        if(!arr.get(left).equals(arr.get(right))){
            return false;
        }
        left++;
        right--;
      }
      return true;
    }
}

