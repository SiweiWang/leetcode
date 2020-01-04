class Solution:
    def longestPalindrome(self, s: str) -> str:
        s = s.lower()
        stringlen = len(s)
        if stringlen == 0 or stringlen ==1:
            return s
        if stringlen == 2:
            return s if s[0] == s[1] else s[0]

        # from codewar for test case 'a' * 10000
        unique_chart = list(set(s))
        if len(unique_chart) == 1:
            return s

        max_size = 0
        substring = ""
        dp = [[0] * stringlen for i in range(stringlen)]
        i = 0
        while i < stringlen:
            dp[i][i] = 1
            i += 1
        start = 0
        i = 0
        while i < stringlen - 1:
            if(s[i] == s[i+1]):
                dp[i][i+1] = 1
                start = i
                max_size = 2
            i = i + 1

        k = 3
        while k <= stringlen:
            i = 0
            while i < (stringlen - k + 1):
                j = i + k - 1
                if (dp[i+1][j-1] == 1 and s[i] == s[j]):
                    dp[i][j] = 1
                    if (k > max_size):
                        start = i
                        max_size = k
                i += 1
            k += 1

        return s[start: start + max_size] if max_size > 1 else s[0]
        # for i in range(stringlen):
        #     for j in range(stringlen):
        #         if i == j:
        #             dp[i][j] = 1
        #         if j - i == 1:
        #             if s[j] == s[i]:
        #                 if j -i + 1 > max_size:
        #                     max_size = j -i + 1
        #                     substring = s[i:j+1]
        #                 dp[i][j] = 1

        # for size in range (2, stringlen):
        #     for j in range(0, stringlen):
        #         if j + size <= stringlen - 1:
        #             if s[j] == s[j + size] and dp[j + 1][j + size -1] == 1:
        #                 if size + 1 > max_size:
        #                     max_size = size + 1
        #                     substring = s[j:j + size+1]
        #                 dp[j][j + size] = 1

        # return substring if max_size > 1 else s[0]

def main():
    sol = Solution()
    print(sol.longestPalindrome("babad"))
    print(sol.longestPalindrome("aaaabbaa"))
    print(sol.longestPalindrome(""))
    print(sol.longestPalindrome("flsuqzhtcahnyickkgtfnlyzwjuiwqiexthpzvcweqzeqpmqwkydhsfipcdrsjkefehhesubkirhalgnevjugfohwnlhbjfewiunlgmomxkafuuokesvfmcnvseixkkzekuinmcbmttzgsqeqbrtlwyqgiquyylaswlgfflrezaxtjobltcnpjsaslyviviosxorjsfncqirsjpkgajkfpoxxmvsyynbbovieoothpjgncfwcvpkvjcmrcuoronrfjcppbisqbzkgpnycqljpjlgeciaqrnqyxzedzkqpqsszovkgtcgxqgkflpmrikksaupukdvkzbltvefitdegnlmzeirotrfeaueqpzppnsjpspgomyezrlxsqlfcjrkglyvzvqakhtvfmeootbtbwfhqucbnuwznigoyatvkocqmbtqghybwrhmyvvuchjpvjckiryvjfxabezchynfxnpqaeampvaapgmvoylyutymdhvhqfmrlmzkhuhupizqiujpwzarnszrexpvgdmtoxvjygjpmiadzdcxtggwamkbwrkeplesupagievwsaaletcuxtpsxmbmeztcylsjxvhzrqizdmgjfyftpzpgxateopwvynljzffszkzzqgofdlwyknqfruhdkvmvrrjpijcjomnrjjubfccaypkpfokohvkqndptciqqiscvmpozlyyrwobeuazsawtimnawquogrohcrnmexiwvjxgwhmtpykqlcfacuadyhaotmmxevqwarppknoxthsmrrknu"))
    print(sol.longestPalindrome("abcda"))
    print(sol.longestPalindrome('a'*10000))
if __name__ == "__main__":
    main()