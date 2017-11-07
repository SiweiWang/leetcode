/**
 * Created by siweiwang on 2017-10-31.
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length -1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) {return null;}

        int mid = (left + right) /2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, left, mid -1);
        root.right = sortedArrayToBST(nums, mid +1, right);
        return root;
    }
}
