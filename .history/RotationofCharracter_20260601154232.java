import java.util.*;
public class  RotationofCharracter{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int n= sc.nextInt();
      String RotationStr = sc.nextLine();
      int len = str.length();
      String rotation ="";
      if(RotationStr =='L'){
        rotation = str.substring(n)+ str.substring(0,n);
      }
      else{
        rotation = str.substring(len-n)+str.substring(0,len-n);
      }
  }
}