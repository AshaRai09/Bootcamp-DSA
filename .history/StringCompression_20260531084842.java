import java.util.*;
public class StringCompression{
  public static void main(String args[]){
    Scanner sc  = new Scanner(System.in);
    String s = sc.nextLine();
    int count=1;
    for(int i=0 ;i<s.length();i++){
      if(i<s.length()-1 && s.charAt(i) == s[i+1]){
        count++;
        i++;
      }
    }
  }
}