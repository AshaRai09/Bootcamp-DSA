import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class VerticalSumIn{

    static TreeMap<Integer, Integer> map = new TreeMap<>();

    public static void verticalSum(TreeNode root, int hd) {

        if (root == null)
            return;

        map.put(hd, map.getOrDefault(hd, 0) + root.val);

        verticalSum(root.left, hd - 1);
        verticalSum(root.right, hd + 1);
    }

    public static void main(String[] args) {

        /*
                1
              /   \
             2     3
            / \   / \
           4   5 6   7
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        verticalSum(root, 0);

        for (int sum : map.values()) {
            System.out.print(sum + " ");
        }
    }
}