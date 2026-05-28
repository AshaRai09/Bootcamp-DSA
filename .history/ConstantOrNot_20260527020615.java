import java.util.*;
public class ConsonantOrNot{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(hasConsonant(s));


  }
  public static boolean  hasConsonant(String s){
    if(s== null) return false;
    return s.matches(".*")
  }
}