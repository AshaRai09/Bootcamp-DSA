// 41. Decode compressed string
import java.util.*;

public class DecodeCompressedString{

    public static String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder curr = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {

            // If digit, build number
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            // Opening bracket
            else if (ch == '[') {
                countStack.push(num);
                stringStack.push(curr);

                num = 0;
                curr = new StringBuilder();
            }

            // Closing bracket
            else if (ch == ']') {

                int repeat = countStack.pop();
                StringBuilder prev = stringStack.pop();

                for (int i = 0; i < repeat; i++) {
                    prev.append(curr);
                }

                curr = prev;
            }

            // Character
            else {
                curr.append(ch);
            }
        }

        return curr.toString();
    }

    public static void main(String[] args) {

        String s = "3[a2[c]]";

        System.out.println(decodeString(s));
    }
}