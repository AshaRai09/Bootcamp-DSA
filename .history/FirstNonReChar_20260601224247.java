import java.util.*;
public  class FirstNonReChar{
  public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        public class Main {
    public static void main(String[] args) {
        String str = "swiss";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}