/**
 * Created by siweiwang on 2017-10-21.
 */
public class SumofLeftLeaves {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public int sumOfLeftLeaves(TreeNode root) {
            return sumLeft(root, false);
        }

        private int sumLeft (TreeNode node, boolean isLeft) {
            int sum = 0;
            if (node == null){
                return 0;
            }
            if (node.left == null && node.right == null){
                return isLeft?  node.val : 0;
            }
            if (node.left != null){
                sum = sum + sumLeft(node.left, true);
            }
            if (node.right != null) {
                sum = sum + sumLeft(node.right, false);
            }
            return sum;
        }

        public static void main(String[] args){
            TreeNode root = new TreeNode(5);
            SumofLeftLeaves s = new SumofLeftLeaves();
            System.out.println(s.sumOfLeftLeaves(root));
        }
}
