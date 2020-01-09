class Solution(object):
    def uniquePathsWithObstacles(self, obstacleGrid):
        """
        :type obstacleGrid: List[List[int]]
        :rtype: int
        """
        m = len(obstacleGrid)
        if m == 0:
            return 0
        else:
            n = len(obstacleGrid[0])
            if n == 0:
                return 0
        dp = [ [0 for i in range(n)] for i in range(m)]

        for i in range(0, m):
            for j in range(0, n):
                if i == 0 and j == 0:
                    if obstacleGrid[i][j] == 1:
                        return 0
                    else:
                        dp[i][j]=1
                elif i == 0:
                    if obstacleGrid[i][j] == 0:
                        dp [i][j] = dp[i][j-1]
                elif j == 0:
                    if obstacleGrid[i][j] == 0:
                        dp [i][j] = dp[i-1][j]
                else:
                    if obstacleGrid[i][j] == 0:
                        dp[i][j] = dp[i][j-1] + dp[i-1][j]
                    else:
                        dp[i][j] = 0

        return dp[m-1][n-1]

def main():
    sol = Solution()
    print(sol.uniquePathsWithObstacles([[0,0,0],[0,1,0],[0,0,0]]))

if __name__ == "__main__":
    main()