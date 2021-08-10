class Solution:

    def totalNQueens(self, n: int) -> int:
        self.n = n
        res = []
        self.backtrack(0,[],res)
        return len(res)

    def backtrack(self, row, pList, res):
        if row == self.n:
            res.append(['.'*x+'Q'+'.'*(self.n-1-x) for x in pList])
            return
        for col in range(self.n):
            if self.isValid(col, row, pList):
                self.backtrack(row+1, pList+[col], res)

    def isValid(self, col, row, pList):
        for r in range(row):
            if pList[r] == col or row-r == abs(col-pList[r]):
                return False
        return True