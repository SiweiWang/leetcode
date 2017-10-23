/**
 * Created by siweiwang on 2017-10-22.
 * https://leetcode.com/problems/symmetric-tree/description/
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return isSym(root.left, root.right);
    }

    boolean isSym(TreeNode left, TreeNode right){
        if (left == null && right == null ) {
            return true;
        } else if (left != null && right != null && left.val == right.val ){
            return isSym(left.left, right.right) && isSym(left.right , right.left);
        } else {
            return false;
        }

    }
}

