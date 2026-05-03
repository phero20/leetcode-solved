class Solution:
    def maxProfit(self, p: List[int]) -> int:
        pr = 0
        for i in range(len(p)-1):
            if p[i] < p[i+1]:
                pr+=p[i+1]-p[i]
        return pr
