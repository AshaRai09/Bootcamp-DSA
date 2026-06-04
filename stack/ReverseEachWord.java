import  java.util.*;
public class ReverseEachWord {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String str = sc.nextLine();
  Stack<Character> st = new Stack<Character>();
  StringBuilder result = new StringBuilder();
  for(int i=0 ;i<str.length();i++){
    char ch = str.charAt(i);
    if(ch!=' '){
        st.push(ch);
    }
    else{
      while(!st.isEmpty()){
        result.append(st.pop());
      }
      result.append(' ');
    }
  }
  while(!st.empty()){
    result.append(st.pop());
  }
  System.out.println(result);
  sc.close();
}
}
