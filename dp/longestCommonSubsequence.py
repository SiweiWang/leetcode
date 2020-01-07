class Solution(object):
    def longestCommonSubsequence(self, text1, text2):
        """
        :type text1: str
        :type text2: str
        :rtype: int
        """
        if len(text1) == 0 or len(text2) == 0:
            return 0

        m = len(text1)
        n = len(text2)
        dp = [ [0] * (n+1) for j in range(m+1)]
        for i in range(m+1):
            for j in range(n+1):
                if i == 0 or j == 0:
                    dp[i][j] == 0
                elif text1[i-1] == text2[j-1]:
                    dp[i][j] = dp[i-1][j-1] +1
                else:
                    dp[i][j] = max(dp[i-1][j], dp[i][j-1])
        return dp[m][n]


    # returns the subsequence
    def subsequence(self, text1, text2):
        if len(text1) == 0 or len(text2) == 0:
            return ""

        m = len(text1)
        n = len(text2)
        dp = [ [0] * (n+1) for j in range(m+1)]
        for i in range(m+1):
            for j in range(n+1):
                if i == 0 or j == 0:
                    dp[i][j] == 0
                elif text1[i-1] == text2[j-1]:
                    dp[i][j] = dp[i-1][j-1] +1
                else:
                    dp[i][j] = max(dp[i-1][j], dp[i][j-1])

        result = []

        while m >= 0 and n >= 0:
            if dp[m][n] > dp[m][n-1] and dp[m][n] > dp[m-1][n]:
                result.append(text1[m-1])
                m = m - 1
                n = n - 1
            elif dp[m][n] > dp[m][n-1]:
                m = m - 1
            else:
                n = n - 1
        result.reverse()
        return "".join(result)

def main():
    sol = Solution()
    print(sol.longestCommonSubsequence("abcde", "ace"))
    # print(sol.subsequence("abcde", "ace"))

    print(sol.longestCommonSubsequence("abc", "abc"))
    # print(sol.subsequence("abc", "abc"))

    print(sol.longestCommonSubsequence("abc", 'def'))
    # print(sol.subsequence("abc", "def"))

if __name__ == "__main__":
    main()

#   _ a c e 
# _ 0 0 0 0
# a 0 1 1 1
# b 0 1 1 1
# c 0 1 2 2
# d 0 1 2 2
# e 0 1 2 3