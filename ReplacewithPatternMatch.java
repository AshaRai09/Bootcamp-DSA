import java.util.*;
public class ReplacewithPatternMatch{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
      String pattern = sc.nextLine();
       String replaceChar = sc.nextLine();
      str = str.replace(pattern,replaceChar);
      System.out.println(str);
  }
}