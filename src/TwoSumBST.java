import java.util.HashMap;
import java.util.Stack;

/**
 * Created by siweiwang on 2017-10-23.
 */
public class TwoSumBST {
    public boolean findTarget(TreeNode root, int k) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        HashMap<Integer, TreeNode> map = new HashMap<Integer, TreeNode>();
        s.push(root);
        while (!s.empty()){
            TreeNode t = s.pop();
            if (t.right != null) { s.push(t.right);}
            if (t.left != null) { s.push(t.left); }
            int diff = k - t.val;
            if (map.containsKey(diff)){
                return true;
            }else {
                map.put(t.val, t);
            }
        }
        return false;
    }
}
