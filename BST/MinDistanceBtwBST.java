import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}
public class MinDistanceBtwBST {
  static int min = Integer.MAX_VALUE;
    static TreeNode prev = null;

    public static int minDiffInBST(TreeNode root) {
        inorder(root);
        return min;
    }
    public static void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);

        if (prev != null) {
            min = Math.min(min, root.val - prev.val);
        }

        prev = root;

        inorder(root.right);
    }
    public static void main(String[] args) {

        /*
                4
              /   \
             2     6
            / \
           1   3
        */

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int ans = minDiffInBST(root);

        System.out.println("Minimum Difference = " + ans);
    }
}
