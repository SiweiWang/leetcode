class Solution:
    def lengthOfLIS(self, nums):
        if len(nums) == 0 or len(nums) ==1:
            return len(nums)

        dp = [1 for i in range(len(nums))]

        for i in range(1, len(nums)):
            for j in range(0,i):
                if nums[i] > nums[j] and dp[i] < dp[j] + 1:
                    dp[i] = dp[j] +1

        return max(dp)

def main():
    sol = Solution()
    print(sol.lengthOfLIS([10,9,2,5,3,7,101,18]))
    print(sol.lengthOfLIS([-1, 3, -34, 18, -55, 60, 118, -64]))
    print(sol.lengthOfLIS([4,10,4,3,8,9]))

if __name__ == "__main__":
    main()

