import java.util.ArrayList;
import java.util.List;

public class BalanceBST {
   List<Integer> list = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {

        inorder(root);

        return build(0, list.size() - 1);
    }

    private void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    private TreeNode build(int start, int end) {

        if (start > end)
            return null;

        int mid = start + (end - start) / 2;

        TreeNode root = new TreeNode(list.get(mid));

        root.left = build(start, mid - 1);

        root.right = build(mid + 1, end);

        return root;
    }
}
