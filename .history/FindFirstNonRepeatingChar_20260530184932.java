import java.util.*;
public  class FindFirstNonRepeatingChar{
  public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
      for(char ch:str.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
      }
      for()
  }
}