import java.util.*;
public class LargestCommanPrefix{
  public static String LongestCPrefix(String str[]){
    StringBuilder result = new StringBuilder();
    Arrays.sort(str);
    char first[] = str[0].toCharArray();
    char last[] = str[str.length-1].toCharArray();
    for(int i=0 ; i<first.length;i++){
      if(first[i]!=last[i])
        break;
      result.append(first[i]);
    }
    return result.toString();
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
         System.out.println("Enter number of  string");
    int n= sc.nextInt();
    sc.nextLine();

    String[] word = new String[n];
    for(int i =0; i<n ;i++){
        word[i] = sc.nextLine();
    }
    String result = longestCPrefix(word);

        if (result.isEmpty())
            System.out.println("No common prefix found.");
        else
            System.out.println("Longest Common Prefix: " + result);

        sc.close();

}
  }
}