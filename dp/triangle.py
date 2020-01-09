class Solution(object):
    def minimumTotal(self, triangle):
        """
        :type triangle: List[List[int]]
        :rtype: int
        """
        dp = triangle[-1]
        n = len(triangle)

        for layer in range(n-2, -1, -1):
            for i in range(layer+1):
                dp [i] = min(dp[i], dp[i+1]) + triangle[layer][i]

        return dp[0]

def main():
    sol = Solution()
    print(sol.minimumTotal([[2],[3,4],[6,5,7],[4,1,8,3]]))

if __name__ == "__main__":
    main()