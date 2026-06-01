import java.util.*;
public class  RotationofCharracter{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int n= sc.nextInt();
      char RotationStr = sc.next().char
      int len = str.length();
      String rotation ="";
      if(RotationStr =='L'){
        rotation = str.substring(n)+ str.substring(0,n);
      }
      else{
        rotation = str.substring(len-n)+str.substring(0,len-n);
      }
      for(int i=0 ; i<n ; i++){
        if()
      }
  }
}