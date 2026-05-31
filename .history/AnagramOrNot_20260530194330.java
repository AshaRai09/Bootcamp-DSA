import java.util.*;
public class AnagramOrNot{
  public static void main(String[] args) {
      Scanner sc  =new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
       if(str1.length()!= str2.length()){
        System.out.println("Not Anagram");
        return;
       }
       int countFreq[] = new int[26];
       for(int i=0 ; i<str1.length(); i++){
        countFreq[str1.charAt(i)-'a']++;
        countFreq[str2.charAt(i)]
       }
      
  }
}