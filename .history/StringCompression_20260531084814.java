import java.util.*;
public class StringCompression{
  public static void main(String args[]){
    Scanner sc  = new Scanner(System.in);
    String s = sc.nextLine();
    int count=1;
    for(int i=0 ;i<s.length();i++){
      if(i<s.length() && s[i] == s[i+1]){
        count++;
        
      }
    }
  }
}