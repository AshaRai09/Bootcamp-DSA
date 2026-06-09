import java.util.*;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder revAns = new StringBuilder();

        
        while (!stack.isEmpty()) {
            revAns.append(stack.pop());
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + revAns);
    }
}