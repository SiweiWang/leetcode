/**
 * Created by siweiwang on 2017-10-16.
 */
public class isSubtree {
         public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
         }

        public boolean isSubTree(TreeNode s, TreeNode t) {
            if (isSame(s, t)) return true;
            return isSubTree(s.left, t) || isSubTree(s.right, t);
        }

        private boolean isSame(TreeNode s, TreeNode t){
            if (s == null && t == null ) return true;
            if (s == null || t == null ) return false;
            return isSame(s.right, t.right) && isSame(s.right, t.right);
         }
}
