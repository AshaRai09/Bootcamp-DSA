import java.util.*;
public class ExpandChar{
    public static String decode(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                countStack.push(num);
                stringStack.push(current);

                current = new StringBuilder();
                num = 0;
            }

            else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder prev = stringStack.pop();

                for (int i = 0; i < repeat; i++) {
                    prev.append(current);
                }

                current = prev;
            }

            else {
                current.append(ch);
            }
        }

        return current.toString();
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner()
        System.out.println(decode("3[a2[bc]]"));
        System.out.println(decode("2[ab]3[cd]"));
        System.out.println(decode("3[a]2[bc]"));
    }
}
  