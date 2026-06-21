import java.util.*;

public EvalPostfix {
    public static int evaluatePostfix(String exp) {
        Stack<Integer> st = new Stack<>();

        for (char ch : exp.toCharArray()) {

            if (Character.isDigit(ch))
                st.push(ch - '0');

            else {
                int val2 = st.pop();
                int val1 = st.pop();

                switch (ch) {
                    case '+':
                        st.push(val1 + val2);
                        break;

                    case '-':
                        st.push(val1 - val2);
                        break;

                    case '*':
                        st.push(val1 * val2);
                        break;

                    case '/':
                        st.push(val1 / val2);
                        break;
                }
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {

        String exp = "23*54*+9-";

        System.out.println(evaluatePostfix(exp));
    }
}