class Solution(object):
    def wordBreak(self, s, wordDict):
        """
        :type s: str
        :type wordDict: List[str]
        :rtype: bool
        """
        m = len(s)
        dp = [ False for i in range(m+1) ]
        dp[0] = True
        for i in range(1, m+1):
            for j in range(i):
                if dp[j] and s[j:i] in wordDict:
                    dp[i] = True
        return dp[m]

def main():
    sol = Solution()
    print(sol.wordBreak("leetcode",["leet", "code"]))
    print(sol.wordBreak("applepenapple",["apple", "pen"]))
    print(sol.wordBreak("catsandog", ["cats", "dog", "sand", "and", "cat"]))

if __name__ == "__main__":
    main()
