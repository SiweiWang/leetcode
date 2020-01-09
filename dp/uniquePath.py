class Solution(object):
    def uniquePaths(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        if m == 0 or n == 0:
            return 0
        dp = [ [1 for i in range(n)] for i in range(m)]
        for i in range(1, m):
            for j in range(1, n):
                dp[i][j] = dp[i][j-1] + dp[i-1][j]
        
        return dp[m-1][n-1]

def main():
    sol = Solution()
    print(sol.uniquePaths(7, 3))
    print(sol.uniquePaths(1, 1))
    print(sol.uniquePaths(0, 0))

if __name__ == "__main__":
    main()