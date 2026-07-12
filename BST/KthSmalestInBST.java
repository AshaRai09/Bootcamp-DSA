import java.util.ArrayList;
import java.util.List;

public class KthSmalestInBST {
 List<Integer> list = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {

        inorder(root);

        return list.get(k - 1);
    }

    private void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);

        list.add(root.val);

        inorder(root.right);
    } 
}
