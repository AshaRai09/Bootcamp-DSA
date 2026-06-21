// 56. Delete Elements With Matching given Prefix
import java.util.*;

public class DeleteElementWithMat {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("apple");
        list.add("app");
        list.add("banana");
        list.add("application");
        list.add("cat");

        String prefix = "app";

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String str = it.next();

            if (str.startsWith(prefix)) {
                it.remove();
            }
        }

        System.out.println(list);
    }
}
