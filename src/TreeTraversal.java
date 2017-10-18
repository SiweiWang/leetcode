import java.util.*;

/**
 * Created by siweiwang on 2017-05-30.
 */

public class TreeTraversal {

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        root.right = right;
        TreeNode left = new TreeNode(3);
        right.left = left;
        TreeTraversal tr = new TreeTraversal();
        System.out.print(tr.inroderTraversal(root));
    }
    public List<Integer> inroderTraversal(TreeNode root){
        List<Integer> inorder = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {

            if (root != null ){
                stack.push(root);
                root = root.left;
            }else {
                root = stack.pop();
                inorder.add(root.val);
                root = root.right;
            }
        }
        return inorder;
    }

    public List<Integer> preoderTraversal(TreeNode root){
        List<Integer> inorder = new ArrayList<Integer>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            inorder.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
        return inorder;
    }


}
