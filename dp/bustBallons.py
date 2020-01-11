class Solution:
    def maxCoins(self, nums: List[int]) -> int:
        # Similar to knapsack with different value calculation 
        # dp[i][j] = max(dp[i][j], ) old max vs adding a new balloons the new value
        # [i][i+1] .... [k] ....[j-1][j] => dp[i][j] = dp[i][k-1] + value([i][k-1][j]) + dp[k+1][j]
        # also need to add bordering for the [1] at each end
        size = len(nums)
        nums = [1] + nums + [1]
        dp = [[0 for _ in range(size + 2)] for _ in range(size + 2)]
        for length in range(1, size + 1):
            for i in range(1, size-length+2):
                j = i + length -1
                
                # find the last to brust
                for l in range(i, j +1):
                    dp[i][j] = max(dp[i][j], dp[i][l-1] + nums[i-1] * nums[l] * nums[j+1] + dp[l+1][j])
        return dp[1][size]