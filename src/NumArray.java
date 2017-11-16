/**
 * Created by siweiwang on 2017-11-13.
 */
public class NumArray {
    int [] dp;
    public NumArray(int[] nums) {
        dp = new int [nums.length];
        for (int i = 0; i < nums.length; i++){
            dp[i] = i == 0 ? nums[i] : nums[i] + dp[i -1];
        }
    }

    public int sumRange(int i, int j) {
        return i == 0 ? dp[j] : dp[j] - dp[i-1];
    }
}
