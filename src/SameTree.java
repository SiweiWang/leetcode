/**
 * Created by siweiwang on 2017-10-29.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }
        if (p ==null || q == null){
            return false;
        }

        if(q.val != p.val){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String [] args){
        SameTree s = new SameTree();
        System.out.println(s.isSameTree(null, null));
    }
}
