import java.util.*;
public class groupAnagram{
  public static List<List<String>> GroupAnagrams(String str[]){
    HashMap<String , List<String>> map = new HashMap<>();
    for(String str1: str){
      char[] chars = str1.toCharArray();
      Arrays.sort(chars);
     String key = new String(chars);
    if(!map.containsKey(key)){
      map.put(key , new ArrayList<>());

    }
    map.get(key).add(str1);
  }
   return new ArrayList<>(map.values());
}
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
     System.out.println(groupAnagrams(strs));

  }
}