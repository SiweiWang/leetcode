/**
 * Created by siweiwang on 2017-10-30.
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root ==null || (root.left == null && root.right == null)) {
            return true;
        }

        if(Math.abs(getDepth(root.left) - getDepth(root.right)) > 1) { return false; }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    int getDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        return 1 + Math.max(getDepth(root.left), getDepth(root.right));
    }
}
