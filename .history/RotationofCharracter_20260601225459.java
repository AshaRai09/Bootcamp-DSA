import java.util.*;
public class  RotationofCharracter{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String str = sc.nextLine();
      int n= sc.nextInt();
      char RotationStr = sc.next().charAt(0);

      int len = str.length();
      n = n%len;
      String result;
      if(RotationStr =='L'){
        String rotated = str.substring(n);
        String moved = str.substring(n)+ str.substring(0,n);
        result = rotated + moved;
      }
      else{
        String moved = str.substring(len-n)+.toUpperCase();
        Stringsubstring(0,len-n);
      }
      for(int i=0 ; i<n ; i++){
        if()
      }
  }
}