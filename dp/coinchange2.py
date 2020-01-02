class Solution(object):
    def change(self, amount, coins):
        """
        :type amount: int
        :type coins: List[int]
        :rtype: int
        """
        combinations = [0] * (amount+1)
        combinations[0] = 1
        for coin in coins:
            for i in range(1, amount+1):
                if i >= coin:
                    combinations[i] += combinations[i - coin]
        return combinations[amount]

def main():
    sol = Solution()
    print(sol.change(5, [1, 2, 5]))
    print(sol.change(3, [2]))
    print(sol.change(11, [1, 2, 5]))

if __name__ == "__main__":
    main()


