import java.util.*;
public class CreateUserName{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
  
    String str = sc.nextLine();
     String str1 = sc.nextLine();
    str = str.toLowerCase();
    // for(int i=0 ; i<str.length()-1 ; i++){
    //   int ch = str.charAt(i);
    //   if(ch>=65 && ch<=91){
    //     ch+=32;
    //   }
    // }
    String word[] = str.trim().split("\\s+"); 
    String res;
    if(word.length>1){
       res = word[0]+ "_" + word[word.length-1]+ str1;
    }
    else{
      res = word[0];
    }
    System.out.println(res);

  
  }}