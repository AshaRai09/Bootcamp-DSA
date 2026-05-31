import java.util.*;

public class removeVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if("aeiouAEIOU".indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}