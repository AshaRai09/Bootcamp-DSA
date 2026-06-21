// 74. Infix,Postfix and prefix implementation & its conversion
import java.util.*;

public class InfixtoPostfix {

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }

        return -1;
    }

    public static String infixToPostfix(String exp) {

        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (char ch : exp.toCharArray()) {

            if (Character.isLetterOrDigit(ch))
                result.append(ch);

            else if (ch == '(')
                st.push(ch);

            else if (ch == ')') {

                while (!st.isEmpty() && st.peek() != '(')
                    result.append(st.pop());

                st.pop();
            }

            else {

                while (!st.isEmpty() &&
                        precedence(ch) <= precedence(st.peek()))
                    result.append(st.pop());

                st.push(ch);
            }
        }

        while (!st.isEmpty())
            result.append(st.pop());

        return result.toString();
    }

    public static void main(String[] args) {

        String exp = "A+B*C";

        System.out.println(infixToPostfix(exp));
    }
}