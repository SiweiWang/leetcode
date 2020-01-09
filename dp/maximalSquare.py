class Solution(object):
    def maximalSquare(self, matrix):
        """
        :type matrix: List[List[str]]
        :rtype: int
        """
        m = len(matrix)
        if m > 0:
            n = len(matrix[0])
            if n == 0:
                return 0
        else:
            return 0

        dp = [[0 for i in range(n)] for i in range(m)]
        result = 0
        for i in range(0, m):
            for j in range(0, n):
                if matrix[i][j] == "0":
                    dp[i][j] = 0
                if matrix[i][j] == "1":
                    dp[i][j] = min(dp[i][j-1], dp[i-1][j], dp[i-1][j-1]) +1
                    result = max(result, dp[i][j]*dp[i][j])
        return result

def main():
    sol = Solution()
    print(sol.maximalSquare([["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]))
    print(sol.maximalSquare([["1"]]))



if __name__ == "__main__":
    main()

# 1 0 1 0 0
# 1 0 1 1 1
# 1 1 1 1 1
# 1 0 0 1 0