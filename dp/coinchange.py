class Solution(object):
    def change(self, amount, coins):
        """
        :type amount: int
        :type coins: List[int]
        :rtype: int
        """
        combinations = [amount+1 for i in range(amount +1)]
        combinations[0] = 0
        for i in range(1, amount+1):
            for coin in coins:
                if coin <= i:
                    combinations[i] = min(combinations[i], combinations[i-coin] +1)
        return -1 if combinations[amount] > amount else combinations[amount]

def main():
    sol = Solution()
    print(sol.change(11, [1, 5, 2]))
    print(sol.change(6249, [186,419,83,408]))

if __name__ == "__main__":
    main()