/**
 * Created by siweiwang on 2017-11-08.
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root){
        if (root == null) { return root;}
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
