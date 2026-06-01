import java.util.*;
public class permutationOfChar{
  static String permutation(String str , String ans){
    if(str.length()==0){
      return "";
    }
    for(int i=0 ; i<str.length() ;i++){
      char ch= str.charAt(i);
      String rem =  str.substring(0,i) + str.substring(i-1)
    }
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     permutation(str , "");

  }
}