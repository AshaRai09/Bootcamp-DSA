import java.util.*;
public class BalancedParanethesis{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    ArrayDeque<Character> stack = new ArrayDeque<>();
    String str = sc.nextLine();
    boolean balanced = true;
    for(int i=0 ; i<str.length() ; i++){
    char ch = str.charAt(i);
    if( ch =='(' || ch=='{' || ch=='['){
      stack.push(ch);
    }
    else if (ch == ')' || ch == '}' || ch == ']') {
      if(stack.isEmpty()){
        balanced = false;
        return;
      }
       char top = stack.pop();
        if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    balanced = false;
                    break;
                }  
    }
    }
     if (!stack.isEmpty()) {
            balanced = false;
        }
     if (balanced)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");

        sc.close();
  }
}