class Solution(object):
    def countBits(self, num):
        """
        :type num: int
        :rtype: List[int]
        """
        dp = [0 for i in range(num+1) ]
        for i in range (num+1):
            dp[i] = dp[i >> 1] + (i & 1)
        return dp

def main():
    sol = Solution()
    print(sol.countBits(2))
    print(sol.countBits(5))

if __name__ == "__main__":
    main()