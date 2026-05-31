import java.util.*;
public class StringCompression{
  public static void main(String args[]){
    Scanner sc  = new Scanner(System.in);
    StringBuilder result = new StringBuilder();
    String s = sc.nextLine();
    int count=1;
    for(int i=0 ;i<s.length();i++){
      if(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
        count++;
        i++;
      }
      result.append(s.charAt(i));
      result
    }
  }
}