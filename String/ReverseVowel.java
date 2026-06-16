// Amazon , ZOHO , Flipcart
import java.util.*;
public class ReverseVowel{
  public static String reverseVowels(String str){
    int n = str.length();
  char[] arr = str.toCharArray();
      int i=0;
      int j=n-1;
      while(i<j){
        if(!isVowel(arr[i])){
          i++;
        }else if(!isVowel(arr[j])){
          j--;
        }
        else{
           char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

          i++;
          j--;
        }
      }
      return  new String(arr);}
   static boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch);
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
}
  public static void main(String args[]){
      Scanner sc =new Scanner(System.in);
      String str = sc.nextLine();
      System.out.println(reverseVowels(str));
      
  }
}