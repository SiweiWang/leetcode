/**
 * Created by siweiwang on 2017-10-31.
 */
public class minDepth {
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }

        if (root.left == null && root.right ==null){
            return 1;
        }

        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        if (root.right == null ){
            return 1 + minDepth(root.left);
        }

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
